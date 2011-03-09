package corejava.string;

import java.util.Arrays;

public class SortChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String   s   =   "alksŒ“¡Ωø≈dfasø©";  
       /* String[]   sa   =   new   String[s.length()];  
        for(int   i=0;   i<sa.length;   i++){  
                sa[i]   =   s.substring(i,i+1);  
        }  */
         char[] sa = s.toCharArray();
        Arrays.sort(sa);
        
        System.out.println(Arrays.toString(sa));
	}

}
