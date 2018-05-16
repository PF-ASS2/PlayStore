package playstore;

import java.util.ArrayList;

//make return objects immutable --- look into this

public class User {

	private String Id;
	private String Name;
	private String Phone_Number;
	private int Balance = 0;
	private OS o;
	private boolean Ispremium = false;
	private ArrayList<Content> ContentBought = new ArrayList<Content>();
	// private User [] usrDetails = new User [3];

	public User(String id, String name, String phone_Number, int balance, OS o) {
		super();
		Id = id;
		Name = name;
		Phone_Number = phone_Number;
		Balance = balance;
		this.o = o;
	};

	public User(String id, String name, String phone_Number, OS o) {
		super();
		Id = id;
		Name = name;
		Phone_Number = phone_Number;
		this.o = o;
	};

	public String getUsr() {
		String usrDetails = "User ID: " + this.Id + ";  Name: " + this.Name + ";  ";
		return usrDetails;
	}

	public String getUsrName() {
		return Name.toString();
	}

	public void becomePremium() {
		try {
			int balance = this.Balance - 100;
			if (balance < 0) {
				throw new BalanceInsufficientException(this.Name + " You don't have enough balance");
			} else {
				this.Ispremium = true;
				this.Balance = balance;
				System.out.println(this.Name + " You are Premium now");
			}
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			return;
		}

	}

	public void buyContent(Content c) {
		try {

			double realprice;
			if (this.Ispremium == true) {
				realprice = 0.8 * c.getPrice();
			} else {
				realprice = c.getPrice();
			}
			;

			if (c instanceof Game) {

				if (!this.o.getType().equals(((Game) c).getO().getType())) {
					throw new OsIncompatibleException("Your OS is not compatible with the game required OS\n");
				} else if (this.o.getVersion() < ((Game) c).getO().getVersion())

				{
					throw new OsVersionIncompatibleException(
							"Your OS Version is not compatible with game required OS Version\n");
				}
			}
			if (this.Balance - realprice < 0) {
				throw new BalanceInsufficientException("You don't have enough balance\n");
			} else {

				this.Balance -= realprice;
				ContentBought.add(c);
				System.out.println("Success! " + this.Name + " just bought " + c.getApplication_Name() + "\n");
			}

		} catch (BalanceInsufficientException f) {
			System.out.println(f.getMessage());

			return;
		} catch (OsIncompatibleException e) {
			System.out.println(e.getMessage());
			return;
		} catch (OsVersionIncompatibleException e) {
			System.out.println(e.getMessage());
			return;
		}

	}

	public void AllContentsBought() {
		System.out.println(this.Name + " has purchased:");
		for (Content c : ContentBought) {
			System.out.println(c.getApplication_Name());
		}
		System.out.println();
	}

}
