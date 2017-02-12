package Polymorphism;

// Polymorphism is defined as two types- 1. compiletime polymorphism and 2. Runtime polymorphism
// compiletime polymorphism example is method over loading
// Runtime polymorphism example is method overriding

public class testOverLoading {
	
	public void m1(int a){
		
		System.out.println("This is method m1");
	}
	
  public void m1(int a,char ch){
		
		System.out.println("This is method m2");
	}
  
  public void m1(char a){
		
		System.out.println("Hello Mahesh");
	}
	
  public static void main(String[] args) {
	
	  testOverLoading test = new testOverLoading();
	  test.m1(10);
	  test.m1(10,'a');
	  test.m1('a');
	  
}
 

}
