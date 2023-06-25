package singleton;



public class DoubleCheckedBlockingSingleTonExample {
	
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

class Abcde {
  String name;
	private static volatile Abcde ab;
	
	private Abcde() {
		System.out.println("Instance created");
	}
	
//	public  void setName(String name){
//		this.name=name;
//	}
	
	
	public  String getName() {
		return this.name;
	}
	
	public static  Abcde getInstance() {
		if(ab==null) {
			synchronized (Abc.class) {
				if(ab==null)
				ab= new Abcde();
			}
		
		}
		return ab;
	}
}
