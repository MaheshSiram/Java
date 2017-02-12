package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<Integer>();
		
		
		List array1 = new ArrayList<>();
		
		ArrayList array2 = new ArrayList();
		
		array2.add("Test");
		array2.add("Test3");
		array2.add("Test2");
		
		System.out.println(array2);
		
		
		ArrayList<String> array3 = new ArrayList<String>();
		
		array3.add("Test");
		array3.add("Test");
		array3.add("Test1");
		array3.add("Test2");
		array3.add("Test1");
		array3.add("Test3");
		
		System.out.println(array2);
		
		System.out.println(array2.size());
		
		array3.retainAll(array2);
		
		System.out.println(array3);
		
		

	}

}
