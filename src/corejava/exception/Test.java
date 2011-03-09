package corejava.exception;

public class Test {
	public Test t = new Test();
	public Test() throws Exception{
		throw new Exception("hello");
	}
	public static void main(String[] args) {
		try{
			Test t = new Test();
			System.out.println("world");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
