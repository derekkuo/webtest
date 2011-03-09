package corejava.string;

public class Example {
	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };
	public static void main(String args[]) {
		Example ex = new Example();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		System.out.println(ex.ch);
	}
	public void change(String str, char ch[]) {
		//生成成员变量String str，它的值是ex对象的str地址
		str = "test ok";
		ch[0] = 'g';
	}
}
