package PlayStore;

public class Game extends Content {

	private boolean isMultiPlayer;
	private OS o;
	private double Price = 0;

	public Game(String iD, String application_Name, double price, boolean isMultiPlayer, OS o) {
		super(iD, application_Name, price);
		this.isMultiPlayer = isMultiPlayer;
		this.o = o;

	}

	public Game(String iD, String application_Name, boolean isMultiPlayer, OS o) {
		super(iD, application_Name);
		this.isMultiPlayer = isMultiPlayer;
		this.o = o;
	}

	public OS getO() {
		return o;
	}

}
