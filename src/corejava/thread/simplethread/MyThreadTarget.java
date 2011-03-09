package corejava.thread.simplethread;

public class MyThreadTarget implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<5; i++){
			//创建线程目标对象
			Runnable r = new MyThreadTarget();
			//把目标对象传递给Thread，即虚拟的CPU
			new Thread(r, "thread "+i).start();
		}
	}

	@Override
	public void run() {
		for(int i=0; i<20; i++)
			System.out.println(Thread.currentThread().getName()+":"+i);
	}

}
