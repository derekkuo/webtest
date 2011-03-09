package myeclipse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**//*5.5.x GA算号源代码*/

public class MyEclipse5SN {

    public static String convert(String s) {

        if (s == null || s.length() == 0)

            return s;

        byte abyte0[] = s.getBytes();

        char ac[] = new char[s.length()];

        int i = 0;

        for (int k = abyte0.length; i < k; i++) {

            int j = abyte0[i];

            if (j >= 48 && j <= 57)

                j = ((j - 48) + 5) % 10 + 48;

            else if (j >= 65 && j <= 90)

                j = ((j - 65) + 13) % 26 + 65;

            else if (j >= 97 && j <= 122)

                j = ((j - 97) + 13) % 26 + 97;

            ac[i] = (char) j;

        }

        return String.valueOf(ac);

    }



    private static int hash(String s) {

        int i = 0;

        char ac[] = s.toCharArray();

        int j = 0;

        for (int k = ac.length; j < k; j++)

            i = 31 * i + ac[j];

        return Math.abs(i);

    }



    private static String inputString() {

        BufferedReader bufferedreader = new BufferedReader(

                new InputStreamReader(System.in));

        String s = null;

        try {

            s = bufferedreader.readLine();

        } catch (IOException ioexception) {

            ioexception.printStackTrace();

        }

        return s;

    }



    public static void main(String args[]) {

        try {

            System.out.println("My Eclipse IDE vxx.xx Keygen");

            System.out.print("License Name : ");

            String s = inputString();



           // 程序关键代码：

            String licStr = "YE3MP-100000-0912310";

            String h = s.substring(0, 1)

                    + licStr

                    + "Decompiling this copyrighted software is a violation of both your license agreement and the Digital Millenium Copyright Act of 1998 (http://www.loc.gov/copyright/legislation/dmca.pdf). Under section 1204 of the DMCA, penalties range up to a $500,000 fine or up to five years imprisonment for a first offense. Think about it; pay for a license, avoid prosecution, and feel better about yourself."

                    + s;

            int j = hash(h);



            String lic = s.substring(0, 1) + licStr + Integer.toString(j);

            System.out.println("License Key : " + convert(lic));

        } catch (Exception exception) {

            exception.printStackTrace();

        }

    }

}