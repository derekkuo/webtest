package corejava.statics;

public class StaticTest {
	static {
		int x = 5;
		System.out.println("--in static block: \nx="+x);
	}
	static int x, y;

	public static void main(String args[]) {
		x--;
		myMethod();
		System.out.println(x + y + ++x);
	}

	public static void myMethod() {
		System.out.println("--go in myMethod --");
		y = x++ + ++x;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("--go out myMethod --");
	}
}
