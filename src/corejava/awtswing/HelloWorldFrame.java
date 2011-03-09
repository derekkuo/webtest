package corejava.awtswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldFrame{
	public static void main(String[] args) {
		JFrame win = new JFrame("Frist Window");
		win.getContentPane().add(
				new JLabel("Hello World!"));
		System.out.println(win.hashCode());
		win.setSize(200,100);
		win.setVisible(true);
	}
}