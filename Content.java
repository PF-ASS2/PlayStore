package playstore;

import java.util.ArrayList;
import java.util.List;

public abstract class Content {

	protected List<Comment> Review = new ArrayList<Comment>();

	// private String usrReview; // maybe not used

	private String ID;
	private String Application_Name;

	private int No_of_Downloads = 0;
	private double Price = 0;

	// constructor to take ID, name and price of app
	public Content(String iD, String application_Name, double price) {
		super();
		ID = iD;
		Application_Name = application_Name;
		Price = price;
	}

	// another constructor for free apps
	public Content(String iD, String application_Name) {
		super();
		ID = iD;
		Application_Name = application_Name;
	}

	public String getApplication_Name() {
		return Application_Name;
	}

	public double getPrice() {
		return Price;
	}

	public void Increase_NoD_by1() {
		this.No_of_Downloads += 1;
	}

	// public abstract void addReviews ();

	public abstract void addReviews(Comment a);

	{

	}

}
