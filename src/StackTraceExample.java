public class StackTraceExample {
	public static void main(String[] args) {
		AnotherClass.firstCall();
	}

	public static void divideZero() {
		int i = 0 / 0;
	}
}

class AnotherClass {
	public static void firstCall() {
		secondCall();
	}

	public static void secondCall() {
		StackTraceExample.divideZero();
	}
}
