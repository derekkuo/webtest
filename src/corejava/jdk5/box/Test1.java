package corejava.jdk5.box;


public class Test1 {

	public static void main(String[] args) {
	    // 装箱
	    int i = 0;
	    Integer integer = i;

	    // 简单的拆箱
	    int j = integer;

	    Integer counter = 1;        // 装箱
	    int counter2 = counter;     // 拆箱

	    while (counter < 100) {
	      System.out.println("计数 "+counter++);
	      
	    }

	}

}
