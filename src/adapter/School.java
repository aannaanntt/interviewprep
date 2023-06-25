package adapter;

public class School {
	
	public static void main(String[] args) {
		
		//PilotPen pp = new PilotPen();
		Pen p = new PenADaptor();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I am bit tired to write a assignment");
	}

}
