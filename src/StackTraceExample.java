public class StackTraceExample {
	public static void main(String[] args) {
		System.out.println("Code beings executing");
		secondMethod();
	}

	public static void secondMethod() {
		OtherClass.thirdMethod();
	}
}

class OtherClass {
	public static void thirdMethod() {
		divideByZero();
	}

	public static void divideByZero() {
		int i = 0 / 0;
		System.out.println(i);
	}
}
