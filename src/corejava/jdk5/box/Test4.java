package corejava.jdk5.box;


public class Test4 {
	public static void main(String[] args) {
	    Boolean arriving = true;
	    Integer peopleInRoom = 0;
	    int maxCapacity = 100;

	    while (peopleInRoom < maxCapacity) {
	      if (arriving) {
	        System.out.printf("�ܸ��˼�����.%d������\n",peopleInRoom);
	        peopleInRoom++;
	      } 
	      else {
	        peopleInRoom--;
	      }
      }}}
