package inner.classes;

import inner.classes.OuterDemi.Inner;

class OuterDemi{
	static int a=10;
	int b=10;
	static class Inner{
		void display(){
			System.out.println(a);
			System.out.println();
		}
	}
}


public class StaticDemo {
	public static void main(String[] args) {
		Inner inner = new OuterDemi.Inner();
		inner.display();
	}

}
