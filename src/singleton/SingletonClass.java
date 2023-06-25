package singleton;

public class SingletonClass {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Abc instance = Abc.getInstance();
			}
		}); 

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Abc instance = Abc.getInstance();
			}
		}); 

	t1.start();
	t2.start();
		
		
	}
}


//lazily example 

class Abc {
  String name;
	private static Abc ab;
	
	private Abc() {
		System.out.println("Instance created");
	}
	
//	public  void setName(String name){
//		this.name=name;
//	}
	
	
	public  String getName() {
		return this.name;
	}
	
	public static synchronized Abc getInstance() {
		if(ab==null)
			ab= new Abc();
		return ab;
	}
}
