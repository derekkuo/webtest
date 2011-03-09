package corejava.basicTypes;

public class TestCast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = (int)(char)(byte) -1;
		System.out.println(num);

		System.out.println("Byte: ");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("Character: ");
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println("Integer: ");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println((int)'7');
		System.out.println((int)'0');
		
	}

}
