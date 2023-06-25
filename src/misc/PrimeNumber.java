package misc;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int number=5;
		int temp=0;
		for(int i=2;i<=number-1;i++) {
			if(number%i==0) {
				temp++;
			}
		}
		
		if(temp>0) {
			System.out.print("Number is not prime");
		}else {
			System.out.print("Number is prime");
		}
	}
}
