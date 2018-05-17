package playstore;

import java.util.ArrayList;
import java.util.List;

public class Comment {

	protected List<Comment> reply = new ArrayList<Comment>();

	private String user;
	private String usrComment;

	public Comment() {

	}

	public Comment(User usrDetails, String usrComs) {

		this.user = usrDetails.getUsr();
		this.usrComment = usrComs;
	}

	public String getUsr() {
		return this.user;
	}

	public String getUsrComment() {
		return this.usrComment;
	}

	public void addReply(Comment r) {

		this.reply.add(r);

	}

	public void display(String t) {
		String tab = t;
		for (Comment r : reply) {
			System.out.println(tab + r.user + r.usrComment);
			tab += "\t";
			r.display(tab);
		}
	}
}
