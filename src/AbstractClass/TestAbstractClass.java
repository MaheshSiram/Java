package AbstractClass;

public class TestAbstractClass extends EampleAbstract{
	
	public void m(){
		System.out.println("This is method in testabstarctclass");
	}

	@Override
	public void test2() {
		System.out.println("This is test2");
	}

	@Override
	public void test3() {
		
		System.out.println("This is test3");
	}

	public static void main(String[] args) {
		
		TestAbstractClass obj = new TestAbstractClass();
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.m();

	}	
	
}
