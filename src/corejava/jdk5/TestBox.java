package corejava.jdk5;

public class TestBox {
	public static void main(String[] args) {
		System.out.println(new Integer(0) == new Integer(0));// false
		System.out.println(new Integer(0) == 0);// true
	}

}
