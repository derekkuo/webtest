package corejava.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectReadWrite {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp.file"));
//		oos.writeObject("hello");
//		oos.writeObject("world");
//		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp.file"));
		while(true){
			try {
				System.out.println((String)(ois.readObject()));
			} catch (EOFException e) {
//				e.printStackTrace();
				break;
			}
		}
	}
}
