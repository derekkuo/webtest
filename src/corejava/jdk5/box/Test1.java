package corejava.jdk5.box;


public class Test1 {

	public static void main(String[] args) {
	    // װ��
	    int i = 0;
	    Integer integer = i;

	    // �򵥵Ĳ���
	    int j = integer;

	    Integer counter = 1;        // װ��
	    int counter2 = counter;     // ����

	    while (counter < 100) {
	      System.out.println("���� "+counter++);
	      
	    }

	}

}
