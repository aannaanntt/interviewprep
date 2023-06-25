 package misc;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		int num=123;
		int temp=num;
		int rev=0,rem;
		
		while(temp!=0) {
			rem=temp%10;//121/10 rem=1
			rev=rev*10+rem;//0*10+1 rev=1
			System.out.println(rev);
			temp=temp/10;//121/10 temp=120
			
			//System.out.println("Value of temp after one iteration"+temp);
		}
		
		if(num==rev) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}
}
