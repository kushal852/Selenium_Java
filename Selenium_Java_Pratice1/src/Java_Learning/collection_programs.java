package Java_Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class collection_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,5,4,6,5,4,3,3,2,1,2,1};
		
		HashSet<Integer> hs= new HashSet<Integer>(); 
		
		for (int i=0;i<a.length;i++) {
			
			hs.add(a[i]);
		}
		
		System.out.println(hs);
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>(); 
		ArrayList<Integer> al = new ArrayList<Integer>();
		
	for (int i=0;i<a.length;i++) {
		int count = 0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				count= count+1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count= count+1;
						
					}
				
				}
			
				hm.put(a[i], count);
			}
			
		}
	
	
	System.out.println(al);
	System.out.println(hm);

	}

}
