package inner.classes;

abstract class A {

	abstract String m1();

	void m2() {
		System.out.println("I am m2");
	}

}

interface interf {
	int returnNumber();
}

public class AnnonymousDemo {

	public static void main(String[] args) {
		A a = new A() {
			String m1() {
				return "Anant";
			}
		};

		a.m1();
		System.out.println(a.m1());

		interf i = new interf() {
			public int returnNumber() {
				return 10;
			}
		};

		interf in = () -> 12;
		System.out.println(in.returnNumber());

		System.out.println(i.returnNumber());
	}

}
