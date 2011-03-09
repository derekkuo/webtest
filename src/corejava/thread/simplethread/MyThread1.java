/**
 * 
 */
package corejava.thread.simplethread;

/**
 * @author Administrator
 *
 */
public class MyThread1 extends Thread {

	public MyThread1(String name) {
		super(name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<5;i++)	//创建5个线程
			new MyThread1("Thread"+i).start();
	}

	@Override
	public void run() {
		for(int i=0; i<20; i++) //输出线程名字和i
			System.out.println(this.getName()+":"+i);
	}

	
}
