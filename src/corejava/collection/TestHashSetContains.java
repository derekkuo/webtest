package corejava.collection;

import java.util.HashSet;
import java.util.Set;

import entity.Student;


public class TestHashSetContains {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("abc", 12);
		Student s2 = new Student("abc", 12);
		
		Set set = new HashSet();
		
		set.add(s1);
		set.add(s2);
		
		System.out.println(set.contains(s2));
	}

}
