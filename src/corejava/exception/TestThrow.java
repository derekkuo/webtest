package corejava.exception;

public class TestThrow {
	public static void main(String[] args) {
		try{
			test();
		}catch( Exception e){
			System.out.println( e.toString() );
		}
		//可以继续运行下去
		System.out.println("main some code");
	}

	public static void test() throws Exception{
		if(1 == 1){
			throw new Exception("first exception");
		}
		System.out.println("test() some code");//不会打印出来
		throw new Exception("second exception");
	}
}