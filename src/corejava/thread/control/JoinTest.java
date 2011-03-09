package corejava.thread.control;

public class JoinTest extends Thread {
	static int result = 0;
	public JoinTest(String name) {
		super(name);
	}
	public static void main(String[] args) {
		System.out.println("主线程执行");
		Thread t = new JoinTest("计算线程");
		t.start();
		System.out.println("result:"+result);
		try {
			long start = System.nanoTime();
			t.join();//主线程等待计算线程执行结束，然后再往下执行
			//t.join(2000);//主线程等待计算线程2S，然后再往下执行，如果计算线程没执行完，在2S后，计算线程紧接执行
			long end = System.nanoTime();
			System.out.println((end-start)/1000000+"毫秒后："+result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		System.out.println(this.getName()+"开始计算……");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		result = (int)(Math.random()*10000);
		System.out.println(this.getName()+"结束计算;");
	}
}