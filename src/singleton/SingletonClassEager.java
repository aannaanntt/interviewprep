package singleton;

public class SingletonClassEager {
	
	public static void main(String[] args) {
		System.out.println(Abc.getInstance());
		System.out.println(Abc.getInstance());
		System.out.println(Abc.getInstance());
		
		System.out.println(Abc.getInstance().getName());
		
		if(Abc.getInstance()==Abc.getInstance())
			System.out.println("Both pointing  to same memory");
	}
}


//lazily example 

class Abcd {
	private static Abcd ab = new Abcd();
	
	private Abcd() {
		
	}

	
//	public  void setName(String name){
//		this.name=name;
//	}
	
	

	
	public static  Abcd getInstance() {

		
		return ab;
	}
}
