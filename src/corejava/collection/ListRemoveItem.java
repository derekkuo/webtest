package corejava.collection;

import java.util.ArrayList;

public class ListRemoveItem {
	public static void main(String[] args) {
		 ArrayList list = new ArrayList();
		 list.add("java");
		 list.add("aaa");
		 list.add("java");
		 list.add("java");
		 list.add("bbb"); 
		 System.out.println(list);
//		 list.removeAll("java");
	}
}
