import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class java_Streams_Practice {

	
	//@Test
	public void regular() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhiram");
		names.add("Kora");
		names.add("Kushal");
		names.add("Akhil");
		names.add("varun");
		int count = 0;
		for(int i=0;i<names.size();i++) {
			
			if(names.get(i).startsWith("K")) {
				count = count + 1;
			}	
		}
		
		System.out.println(count);	
	}
	
	//@Test
	public void streamFilter() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhiram");
		names.add("Kora");
		names.add("Kushal");
		names.add("Akhil");
		names.add("varun");
		names.add("Don");
		
		/* Working of streams can be explained in three stages with example.
		 * 
		 * First create a stream. -> names.stream()
		 * Perform intermediate operations on the initial stream to transform it into another stream. -> names.stream().filter(s->s.startsWith("K"))
		 * Perform terminal operation  on the final stream -> names.stream().filter(s->s.startsWith("K")).count()
		 * 
		 * */
		
		// print the count of names which start with "K"
		System.out.println(names.stream().filter(s->s.startsWith("K")).count());
		
		
		long d = Stream.of("Abhiram","Kora","Kushal","Akhil").filter(s->
		{
			s.startsWith("K");
			//s.startsWith("A");
			return true;
			
		}).count();
		
		System.out.println(d);
		
		//printing a name which is having length > 4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		// printing the first name which is having length > 4
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
	}
	//@Test
	public void streamMap() {
		
		// map stream is used whenever we need any modification in the list.
		// printing the name which is ending with l  in uppercase
		
		//Stream.of("Abhiram","Kora","Kushal","Akhil").filter(s->s.endsWith("l")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		// printing the name which is ending with n or starts with K in uppercase
		
		Stream.of("Abhiram","Kora","Kushal","Akhil","varun","pqn","kmn").filter(s->(s.endsWith("n") || s.startsWith("K")))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("\n");
		// printing the name which is ending with n and length with <4
		
		Stream.of("Abhiram","Kora","Kushal","Akhil","varun","pqn","kmn").filter(s->(s.endsWith("n") && s.length()<4))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));		
		System.out.println("\n");
	
	   // sorted stream method 
		Stream.of("Abhiram","Kora","Kushal","Akhil","varun","pqn","kmn").filter(s->(s.endsWith("n") && s.length()<4))
		.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));		
		
		System.out.println("\n");
		
		List<String> names1 = Arrays.asList("Abhiram","Kora","Kushal","Akhil","varun","pqn","kmn");
		List<String> heros = Arrays.asList("Mahesh","Pavan","Prabhas","Arjun","NTR");
	  // merging two streams
	    Stream<String> Newstream = Stream.concat(names1.stream(), heros.stream());
	    //Newstream.forEach(s->System.out.println(s));
	    
	    boolean flag = Newstream.anyMatch(s->s.equalsIgnoreCase("Kushal"));
	    System.out.println(flag);
	    Assert.assertTrue(flag);
		
	
	}

    @Test
	public void streamCollect() {
		
		
		List<String> ls = Stream.of("Abhiram","Kora","Kushal","Akhil","varun","pqn","kmn").filter(s->(s.endsWith("n") || s.startsWith("K")))
		.map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(ls.get(0));// this can be done with filter and limit also
		
		List<Integer> values= Arrays.asList(3,4,5,1,3,4,1,1);
		// here we are using sorted,distinct and printing the unique values in order
		values.stream().sorted().distinct().forEach(s->System.out.println(s));
		
		// here we are sorting and collecting the sorted values to set (eliminate the duplicates) 
		Set<Integer> distinct_val = values.stream().sorted().collect(Collectors.toSet());
		System.out.println(distinct_val);
		
		// getting the third element i the sorted list using collect stream -> we can not do this with filter because using filter we can limit the results
		System.out.println(ls.get(3)); // this cannot be achieved using filter with limit getting the first element using limit is possible.
		
		
		
		
		
	}



}
