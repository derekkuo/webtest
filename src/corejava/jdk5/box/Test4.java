package corejava.jdk5.box;


public class Test4 {
	public static void main(String[] args) {
	    Boolean arriving = true;
	    Integer peopleInRoom = 0;
	    int maxCapacity = 100;

	    while (peopleInRoom < maxCapacity) {
	      if (arriving) {
	        System.out.printf("很高兴见到你.%d号先生\n",peopleInRoom);
	        peopleInRoom++;
	      } 
	      else {
	        peopleInRoom--;
	      }
      }}}
