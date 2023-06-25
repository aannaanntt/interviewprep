package adapter;

public class PenADaptor implements Pen{
	
	
	PilotPen pp = new PilotPen();
	@Override
	public void write(String str) {
	pp.mark(str);
	}

}
