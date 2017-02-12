package AbstractClass;

public abstract class EampleAbstract {

	
	 /*A class having at-least one abstract method is know as abstract method.
    An abstract class can have both abstract method and concrete method(method with body)
	 Method which is declared as abstract and doesn't have any implementation is know as abstract method
	 In java we can not create instance of the abstract class
	 */
	
	public void test1(){                             // This is a concrete method
		System.out.println("I am an abstract class");
	}
	
	public abstract void test2(); // This is abstract Method which is declared without body.
	
	public abstract void test3();

}
