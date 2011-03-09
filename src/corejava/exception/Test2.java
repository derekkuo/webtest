package corejava.exception;

public class Test2 {
	public Test2() throws Exception{
		throw new Exception("hello");
	}
	public static void main(String[] args) throws Exception{
		System.out.println("world");
		Test2 t = new Test2();
	}
}

