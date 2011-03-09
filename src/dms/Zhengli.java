package dms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;

public class Zhengli {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream( "src/dms/wtmpx" );
		byte[] b = new byte[372];
		fis.read(b);
		fis.close();
		
		String s1 = new String(b, 0, 32, Charset.forName("UTF-8")).trim();
		System.out.println(s1);
		//68 ,4
		int i1 = ByteUtil.bytes2IntBE(b, 68, 4);
		System.out.println(i1);
		int i2 = ByteUtil.bytes2IntBE(b, 72, 2);
		System.out.println(i2);
		System.out.println(s1+"\t"+i1+"\t"+i2);
	}
	
	
}
