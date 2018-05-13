package PlayStore;
import java.util.ArrayList;
public abstract class Content {

	private String ID;
	private String Application_Name;
	
	private int No_of_Downloads = 0;
	private double Price=0;
	private ArrayList<Comment> Review= new ArrayList<Comment>();

	public Content(String iD, String application_Name, double price) {
		super();
		ID = iD;
		Application_Name = application_Name;		
		Price = price;
	}
	

	

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

	public String getID() {
		return ID;
	}
}
