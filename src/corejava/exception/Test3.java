package corejava.exception;

public class Test3 {
	public static void main(String[] args) throws Exception{
		System.out.println( "in main test() value: "+test() );
	}
	public static int test() throws Exception {
		int i = 3;
		try {
			i = 5;
			throw new Exception();
//			return i;
		} catch (Exception e) {
			i = 8;
			System.out.println("in catch i ="+i);
//			return i;
		}finally{
			i = 9;
//			throw new Exception();
			System.out.println("in finally i ="+i);
//			return i;
		}
		System.out.println("after try catch i = "+i);
		return i;
	}
}
