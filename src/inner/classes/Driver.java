package inner.classes;

 class Outer {
	int a=10;
	
	public Outer() {
	System.out.println("Outer class cons called");
	}	
	
	class Inner {
		int a=20;
		public Inner() {
			System.out.println("Inner class cons called");
		}
		void  printValue(){
			System.out.println("value is "+this.a);
		}
		
		
	}
	
	
}

class Driver {
	
	public static void main(String[] args) {
		Outer.Inner obj = new Outer().new Inner();
	
		System.out.println("Inner class a variable"+obj.a);
		obj.printValue();
	}
}
