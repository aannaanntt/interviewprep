package misc;

public class Fibonacci {
	
	static int a=0;static int b=1; static int sum=0;
	public static void main(String[] args) {
		//FibbonaciwithoutRecursion(5);
		
		FibbonaciwithRecursion(5);
	}

	private static void FibbonaciwithRecursion(int i) {
		
		if(i>=1) {
			sum=a+b;
			System.out.println(sum+" ");
			a=b;
			b=sum;
			FibbonaciwithRecursion(i-1);
		}
		
	}

	private static void FibbonaciwithoutRecursion(int count) {
		int a=0; int b=1;int sum=0;
		
		for(int i=0;i<=count;i++) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}

}
