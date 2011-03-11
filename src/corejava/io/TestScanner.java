package corejava.io;

import java.util.Scanner;

public class TestScanner {
	/**
	 * When you use input.nextInt() it is left in the buffer a linefeed ('\n'). 
	 * Then when you use input.nextLine() this method return that character and the execution of the program continue. 
	 * So you can help that placing an input.nextLine() after the input.nextInt() in order to get rid the '\n'.
	 * 
	 * nextInt（） 接收一个整型字符，nextline（）读入一行文本，会读入"\n"字符，但"\n"并不会成为返回的字符
		串值的一部分
		
		加入如下代码
		int n = ScannerObjext.nextInt()
		String s1 = ScannerObjext.nextLine();
		String s2 = ScannerObjext.nextLine();
		假设输入：
		42
		and don't you
		forget it
		在这种情况下，n的值为42，s1设置为空白字符,s2设置为and don't you
		因为nextInt()读入42，但并没有读入"\n"，因此S1调用42所在行的剩余部分
		
		结合不同的方法从键盘读取字符输入时，有时不得不包含一条额外的nextLine()调用，以去除行的结束符。 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println( "nextInt()" + in.nextInt() );
		in.nextLine();		
		System.out.println( "nextLine()" +in.nextLine() );
		
		System.out.println("-------------------test 2 -----------------------");
		Scanner scannerobject = in;
		int n = scannerobject.nextInt(); 
		String s1 = scannerobject.nextLine(); 
		String s2 = scannerobject.nextLine();
		System.out.println(n);
		System.out.println(s1);
		System.out.println(s2);
		/*
		假设输入： 
		42 
		and don't you 
		forget it 
		在这种情况下，n的值为42，s1设置为空白字符,s2设置为and don't you 
		因为nextInt()读入42，但并没有读入"\n"，因此S1调用42所在行的剩余部分
		*/ 


	}
}
