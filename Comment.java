package playstore;

import java.util.ArrayList;
import java.util.List;

public class Comment {

	protected List<Comment> reply = new ArrayList<Comment>();

	protected User user;
	protected String usrComment;
	// Content content = new Content();

	public Comment() {
	}

	public Comment(User usrDetails, String usrComs) {

		this.user = usrDetails;
		this.usrComment = usrComs;

	}

	public void addReply(Comment r) {
		// Comment1 c = new Comment1();
		this.reply.add(r);
	}

	@Override
	public String toString() {
		return this.user.getUsr() + '"' + this.usrComment + '"';
	}

	public void printAllReview() {
		for (Comment a : this.reply) {

			System.out.println(a);
		}
	}

}