package misc;

public class FactorialProgram {
	static 	int fact=1;
	public static void main(String[] args) {
		//factorialWithoutRecursion(5);
		System.out.println(factorialWithRecursion(5) );
}

	private static int factorialWithRecursion(int no) {
		
	
		if(no>=1) {
			fact=fact*no;
			factorialWithRecursion(no-1);
		}
		return fact;
		
		
	}

	private static void factorialWithoutRecursion(int no) {
		// TODO Auto-generated method stub
		
		int fact =1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		System.out.println(fact); 
	}
	}
