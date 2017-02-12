package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	
	public static void main(String[] rags){
		
		List<Object> array = new ArrayList<>();
		
		array.add(1);
		array.add(3);
		array.add(5);
		array.add(30);
		array.add(19);
		array.add("Mahesh");
		System.out.println("Total list: " + array);
		System.out.println(array.size());
		System.out.println(array.get(5));
		
	}

}
