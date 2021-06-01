package Java_Learning;

public class string_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Strings can be defined in two ways
		 * string literals(basic data types creation) , String object creation.
		 * */
		
		String a= " javatraining";// String Literal
		//String ab = new String("Gupta");// String object creation

		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("t"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("rahul teaches"));
		//a.length()
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		//split
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
		

	}

}
