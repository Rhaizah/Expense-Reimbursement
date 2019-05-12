package dk.code.expense;

public class Status {

	private int state;
	private String comment;
	
	public Status(int state, String comment) {
		super();
		this.state = state;
		this.comment = comment;
	}
		
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
