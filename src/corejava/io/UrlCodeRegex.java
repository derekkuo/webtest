package corejava.io;

/**
 * 此程序是获得网页源代码中某个关键字的链接网址，
 * 如<a href="http:\\www.sina.com" target="blank">新浪</a>
 * 
 * 本程序编码GBK
 * 引自http://topic.csdn.net/u/20080402/08/89242129-bb92-4759-8c1c-2f80e9a76e96.html
 */
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class UrlCodeRegex {
	public static void main(String[] args) {
		try {
			String ur = "http://csbbs.soufun.com/2710156784~-2~683/5236858_5236858.htm"; // 获取远程网上的信息
			URL MyURL = new URL(ur);
			String str;
			URLConnection con = MyURL.openConnection();
			InputStreamReader ins = new InputStreamReader(con.getInputStream());
			BufferedReader in = new BufferedReader(ins);
			StringBuffer sb = new StringBuffer();
			while ((str = in.readLine()) != null) {
				sb.append(str);
			}
			in.close();
			
			String pattStr = ".*<a href=\"(http://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?)\".*>首页</a>.*";
			System.out.println(pattStr);
			Pattern p = Pattern.compile(pattStr);
			Matcher m = p.matcher(sb.toString());
			m.matches();
			System.out.println("这个社区的网址是" + m.group(1));
		} catch (MalformedURLException mfURLe) {
			System.out.println("MalformedURLException: " + mfURLe);
		} catch (IOException ioe) {
			System.out.println("IOException: " + ioe);
		}
	}
}
