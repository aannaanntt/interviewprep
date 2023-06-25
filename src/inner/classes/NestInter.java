package inner.classes;


interface I1{
	interface I2{
		void show();
	}
}
public class NestInter {


	public static void main(String[] args) {
//		I1.I2 i = new I1.I2() {
//			@Override
//			public void show() {
//				System.out.println("Gi");
//			}
//		};
		
		I1.I2 i= ()->{System.out.println("Bye");};
		i.show();
	
	}
}
