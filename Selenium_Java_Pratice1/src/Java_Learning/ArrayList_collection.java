package Java_Learning;

import java.util.ArrayList;

public class ArrayList_collection {
	
	// can accept duplicate values
	//ArraList,LinkedList,vector- Implementing List interface
	//array have fixed size where as arraylist can grow dynamically 
	//you can access and insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("kushal");
		a.add("java");
		System.out.println(a); 
		a.add(0, "student"); 
		System.out.println(a); 
		/*a.remove(1);
		 *  a.remove("java"); 
		 * System.out.println(a);*/ 
		System.out.println(a.get(2)); 
		// testing 
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("kushal")); 
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		}

	}


