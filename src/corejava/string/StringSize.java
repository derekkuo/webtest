package corejava.string;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringSize {
	public static void main(String[] args) throws IOException {
		String str = "./src/学Java.dat";
		System.out.println(str.getBytes().length);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream( "xuejava.dat" ) );
		dos.writeChars(str);
		dos.close();
	}
}
