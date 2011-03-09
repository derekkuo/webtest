package corejava.string;

import java.util.Arrays;

 
class SplitString
{ 
    public static String split(String str,int num) 
    { 
    	/*String s="sdfes1324dfer324";
    	char[] c=s.replaceAll("[^0-9]*", "").toCharArray();
    	Arrays.sort(c);
    	System.out.println(c);*/
        byte[] strs = str.getBytes();
        if(strs[num-1]<0)
        {
        	System.out.println( "strs[num-1]"+strs[num-1] );
        	System.out.println( "num" + --num);
            num=num-1;
        }
        byte[] news = new byte[num];
        System.arraycopy(strs,0,news,0,num);
        return new String(news);
    } 
    public static void main(String[] args) 
    { 
        String str = split("��ABC", 4); 
        System.out.println(str);
        String str2 = split("��ABC��DEF", 8); 
        System.out.println(str2);
    } 
}
