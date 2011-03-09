package corejava.extend;

public class TestExtend {
	public static void main(String[] args) {
		 A a = new A();
		 B b = new B();
		 C c = new C();
		 D d = null;

		 a = b;
		 d = b;
		 d = (D)a;
		 //c = (C)b;
	}
}

class A{} 
class B extends A implements D {} 
class C extends A {} 
interface D {} 