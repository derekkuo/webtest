package corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entity.Student;

public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List  list = new ArrayList();
		list.add(new Student("abc", 22.22));
		list.add(new Student("def", 33.33));
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
	}

}
