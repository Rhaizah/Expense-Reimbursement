package dk.code.expense;

public enum State {

	APPROVAL (1),
	REJECT (2),
	PendingApproval (3),
	Draft (4),
	Booked (5);
	
	private int value;
	
	private State(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
}
