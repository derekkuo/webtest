package corejava.exception;

public class TestTry {
	int test() {
		int num = 2;
		try {
			num++;
			return num;
		} finally {
			num = 9;
			System.out.println("in finally"+num);
			return num;
		}
	}

	public static void main(String[] args) {
		TestTry t = new TestTry();
		System.out.println(t.test());
	}
}
