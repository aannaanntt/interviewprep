package inner.classes;


class OuterDemo {
	public void OuterMethod() {
		class InnerC{
			public void innerMethod() {
				System.out.println("Getting confused");
			}
		}
		
		System.out.print("Outer Method");
		InnerC ic = new InnerC();
		ic.innerMethod();
	}
	

}


public class LocalDemo {
	
	public static void main(String[] args) {
		OuterDemo od = new OuterDemo();
		od.OuterMethod();
	}

}
