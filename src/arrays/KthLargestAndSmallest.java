package arrays;

public class KthLargestAndSmallest {
	
	public static void main(String[] args) {

		int a[] = { 2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28 };
		
		int k=4;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		
			if(i==k-1) {
				System.out.println("Element is"+" "+a[i]);
				break;
			}
		}
	}

}
