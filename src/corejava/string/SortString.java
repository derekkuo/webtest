package corejava.string;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
        String[] text = { "bc", "de", "ac", "abc", "ab", "e", "a" };
        String temp = "";
        for (int i = 0; i < text.length; i++) {
            for (int j = i+1; j < text.length; j++) {
                if (text[i].compareTo(text[j]) > 0) {
                    temp = text[i];
                    text[i] = text[j];
                    text[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(text));
	}

}
