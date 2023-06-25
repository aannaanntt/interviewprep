package designpatterns;



public class ObjectFactory {
	
	public Os getInstance(String os) {
		if(os.equals("Open")) {
			return new AndroidOs();
		}else if(os.equals("Close")) {
			return new Ios();
		}
		else {
			
			return new WidnowOs();
		}
	}

}
