package corejava.exception;

public class Test4 {
	public static void main(String[] args) {
		int j = test();
		System.out.println(j);
	}

	public static int test() {
		int i = 3;
		try {
			// throw new Exception("hello");
			return i;
		} catch (Exception e) {
			i = 8;
			// return i ;
		} finally {
			i = 5;
			System.out.println("~~~~~" + i);
//			 return i;
		}
		System.out.println(i);
		return i;
	}
}
