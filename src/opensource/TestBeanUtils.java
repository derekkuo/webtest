package opensource;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;

import entity.Student;

public class TestBeanUtils {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Map map = new HashMap();
		map.put("name", "java");
		map.put("salary", 200);
		Student student = new Student();
		BeanUtils.populate(student, map);
		System.out.println(student.getName() + "," + student.getSalary());
	}
}
