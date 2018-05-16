package playstore;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Enumeration;

//COSC2531 Programming Fundamentals,Sem 2,2018*!!!!!!!!!!!!!!!!!!IMPORTANT!!!!!!!!!!!!!!!!!!This is a sample main method that checks the funtionalities required in the assignment 2. This file will NOT compile unless you write all the required java classes,along with their attributes and the methods.

public class PlayStore {
	// Student to do: Add the necessary attributes and methods
	public Hashtable<String, Content> storeContent = new Hashtable<String, Content>();
	// public List<Content> storeContent = new ArrayList<Content>();
	public List<User> usrDetails = new ArrayList<User>();

	private User usr;
	private Content content;
	// private Game game;
	// private Book book;

	// Enumeration Content;
	// String keyValue;

	public void addContents(Content a) {
		// grab key details
		Content b = a;
		String c = b.toString();

		if (a instanceof Game) {

			this.storeContent.put(c, a);
			// System.out.println(storeContent.get());
			System.out.println("Game: " + b + " added to the PlayStore.\n");
		} else if (a instanceof Book) {

			this.storeContent.put(c, a);
			// String bName = book.getApplication_Name();
			// print out book added
			System.out.println("Book: " + b + " added to the PlayStore.\n");
		} else if (a instanceof Magazine) {
			// grab details

			// add content to store
			this.storeContent.put(c, a);

			// print out book added
			System.out.println("Magazine " + b + " added to the PlayStore.\n");
		}
	}

	public void addUsers(User r) {

		this.usrDetails.add(r);

		String s = r.toString();

		System.out.println(s + " has joined the PlayStore\n");
	}

	public void showReadingOfGenre(String n) {

	};

	public void showAllContents() {

	}

	public static void main(String[] args) {
		PlayStore admin = new PlayStore();
		// adding new readings

		String[] authors = { "L. Tolstoy" };
		Book b1 = new Book("R1", "War and Peace", 12, "The Russian Messenger‎", "Novel", 1225, authors);
		String[] authors2 = { "F. Scott Fitzgerald" };
		Book b2 = new Book("R2", "The great gatsby", 10, "Charles Scribner's Sons", "Novel", 180, authors2);
		String[] authors3 = { "Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein" };
		Book b3 = new Book("R3", "Introduction to algorithms", 100, "MIT Press", "Computer Science", 1312, authors3);
		Magazine m1 = new Magazine("R4", "Forbes", 8, "Forbes Media‎", "Business", 50, "World’s richest under 30");

		admin.addContents(b1);
		admin.addContents(b2);
		admin.addContents(b3);
		admin.addContents(m1);

		// adding new games
		OS os1 = new OS("Android", 4);
		OS os2 = new OS("iOS", 10);
		OS os3 = new OS("Android", 3);
		Game g1 = new Game("g1", "Pokemon", 5, false, os1);
		Game g2 = new Game("g2", "Pokemon", 5, false, os2);
		Game g3 = new Game("g3", "MineCraft", 2, true, os1);

		admin.addContents(g1);
		admin.addContents(g2);
		admin.addContents(g3);

		// adding new users
		User u1 = new User("u1", "Splnty", "0412000", 120, os1);
		User u2 = new User("u2", "JumpingJack", "0412001", 120, os1);
		User u3 = new User("u3", "MrBee", "0412002", 100, os2);
		User u4 = new User("u4", "TakTakBoom", "0412003", 50, os3);

		admin.addUsers(u1);
		admin.addUsers(u2);
		admin.addUsers(u3);
		admin.addUsers(u4);

		// Users are buying contents

		u1.buyContent(b1);
		u1.buyContent(b3);
		u4.buyContent(g1);
		u1.buyContent(m1);

		// some users becoming premium and then buying contents

		u4.becomePremium();
		u4.buyContent(m1);
		u2.becomePremium();
		u2.buyContent(g3);
		u2.buyContent(g1);

		// showing contents bought by the user u2
		u2.AllContentsBought();

		// showing all contents in the PlayStore
		admin.showAllContents();

		// showing all reading type of objects with the genre “Novel�?
		admin.showReadingOfGenre("Novel");

		// Student to do: call a method to show all games. What should be the
		// parameters // of that //method? See Section 2, functionality 7

		Comment cm = new Comment(u1, "Pokemon is timeless, who doesn't like Pokemon!");
		g1.addReviews(cm);
		Comment cmr1 = new Comment(u2,
				"Really? You run around in imaginary fields hunting for imaginary animals...lame.");
		cm.addReply(cmr1);
		Comment cmr2 = new Comment(u1, "Nah, a game doesn't stick around for 20 years if it's crap");
		cmr1.addReply(cmr2);
		Comment cmr3 = new Comment(u2, "Yea, but I just find it boring.");
		cmr2.addReply(cmr3);
		Comment cm2 = new Comment(u3, "Does anyone else find it crashes all the time?");
		g1.addReviews(cm2);
		Comment cm2r1 = new Comment(u4, "Not me, maybe you have a dodgy phone.");
		cm2.addReply(cm2r1);
		Comment cm2r2 = new Comment(u3, "Really?? It's unplayable for me.");
		cm2r1.addReply(cm2r2);
		Comment cm2r3 = new Comment(u1, "Time to upgrade your iPhone...lols.");
		cm2r2.addReply(cm2r3);

		// showing all reviews including the replies on object g1
		g1.printAllReview();

	}
}
