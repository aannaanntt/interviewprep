package arrays;
class M1 {
	
	public void m1() {
		System.out.println("Hi m1");
	}
	
	
	
	
}

class M2 extends M1 {
	@Override
	public void m1() throws ArithmeticException {
		System.out.println("Child class");
	}
}
public class Methodaovr {

}
