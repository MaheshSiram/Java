package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
	
	public static void main (String args[]){
		
     List<String> array1 = new ArrayList<String>(); // 
		
		array1.add("Mahesh");
		array1.add("siddhu");
		array1.add("Tanu");
		
		
		int Size = array1.size();
		System.out.println(array1);
		System.out.println(Size);
		
		List<Integer> array2 = new ArrayList<Integer>();
		array2.add(2);
		array2.add(25);
		array2.add(28);
		System.out.println(array2);
		System.out.println(array2.contains(25));
		System.out.println(array2.contains(205));
		
		System.out.println(array2.remove(2));
		System.out.println(array2);
		
	}

}
