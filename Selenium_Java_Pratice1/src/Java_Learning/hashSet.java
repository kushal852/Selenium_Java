package Java_Learning;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 * All the classes (Hashedset,linkedhashedset,treeset) which implement the set interface will not accept the duplicate values.
   There is no guarantee elements stored will follow sequential order.
 * */
		
		HashSet<String> hs= new HashSet<String>(); 
		hs.add("USA"); 
		hs.add("UK"); 
		hs.add("INDIA"); 
		hs.add("he"); 
		hs.add("she"); 
		hs.add("INDIA"); 
		System.out.println(hs); 
		//System.out.println(hs.remove("UK")); 
		System.out.println(hs.isEmpty()); 
		System.out.println(hs.size()); 
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()); 
		}

	}

}
