package dk.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dk.code.expense.State;
import dk.code.expense.Status;



public class TestStatus {
	
	Status status;
	
	@Before
	public void first() {
		 status = new Status(State.APPROVAL.getValue(),"Under way");
	}
	
	@Test
	public void testStatusStateOk() {
		
		
		assertEquals(1, status.getState());
	}
	
	@Test
	public void testStatusCommentOk() {
		
		assertEquals("Under way", status.getComment());
	}

}
