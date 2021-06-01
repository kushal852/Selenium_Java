package Java_Learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		hm.put(0, "hello");
		hm.put(1, "Gudbye"); 
		hm.put(42, "morning"); 
		hm.put(3, "evening"); 
		System.out.println(hm.get(42)); 
		hm.remove(42); 
		System.out.println(hm.get(42)); 
		Set sn= hm.entrySet(); // here we have converted the hashmap into set so each element in the set consists of key and value
		System.out.println(sn); 
		Iterator it =sn.iterator();
		//hashtable -pass table set collections  
		while(it.hasNext()) 
		{ 
			//System.out.println(it.next()); 
			Map.Entry mp=(Map.Entry)it.next(); 
			// since each element in the set consists of key and value we have use map.entry to retrieve key and value separately
			System.out.println(mp.getKey()); 
			System.out.println(mp.getValue()); }
		}

	

}
