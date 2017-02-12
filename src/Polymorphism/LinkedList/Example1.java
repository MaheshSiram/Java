package Polymorphism.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Example1 {
	
	public static void main(String[] args) {
		
		List linkedlist = new LinkedList<>();
		
		linkedlist.add("Test");
		
		linkedlist.add("Test");
		
		linkedlist.add("Test");
		
		linkedlist.add(10);
		
		linkedlist.add(30);
		
		System.out.println(linkedlist);
		
		System.out.println(linkedlist.get(3));
		
		System.out.println(linkedlist.size());
		
		
		
		
		
		
	}

}
