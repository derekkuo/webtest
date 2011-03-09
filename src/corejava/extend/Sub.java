package corejava.extend;

class Super {
	public int getLength() {
		return 4;
	}
}

public class Sub extends Super {
	// 子类中出现和父类相同方法名时，就必须保证此方法符合方法覆盖重写原则
	// 同名同参同返回，访问权限同或大，异常相同或更小
	// public long getLength(){ //error
	public int getLength() {
		return 5;
	}

	public static void main(String[] args) {
		Super sooper = new Super();
		Super sub = new Sub();
		System.out.println(sooper.getLength() + "," + sub.getLength());
	}
}
