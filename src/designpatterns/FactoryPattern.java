package designpatterns;

public class FactoryPattern {
	
	public static void main(String[] args) {
		ObjectFactory obj = new ObjectFactory();
			Os instance = obj.getInstance("Open");
			instance.spec();
	}

}
