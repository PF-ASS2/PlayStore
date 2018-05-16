package playstore;

import java.util.ArrayList;
import java.util.List;

public class Comment {

	protected List<Comment> reply = new ArrayList<Comment>();

	private User user;
	// private Content content;
	private String usrComment;

	public Comment() {

	}

	public Comment(User usrDetails, String usrComs) {

		this.user = usrDetails;
		this.usrComment = usrComs;
	}

	public void addReply(Comment r) {

		this.reply.add(r);

	}

	@Override
	public String toString() {
		return this.user.getUsr() + '"' + this.usrComment + '"';
	}

	public void display(String t) {
		String tab = t;
		for (Comment r : reply) {
			System.out.println(tab + r);
			tab += "\t";
			r.display(tab);
		}
	}
}
