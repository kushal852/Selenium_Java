package Java_Learning;

public class static_keyword_usage {
	
	String address; // instance variables
	String name; // instance variables
	int i =0; // instance variables
	static String city = "vizag"; // class variables
	static int j = 0; // class variables
	
	public static_keyword_usage(String addr,String name) {
		// this.address is the instance variable
		this.address = addr;
		this.name = name;
		i++;
		j++;
		System.out.println("Variable i will be incremented only once since it depends upon object creation "+i);
		System.out.println("Variable j will  be incremented every time constructor executes since it does not depend upon object creation "+j);
		
	}
	
	public void get_data() {
		
		System.out.println(address);
		System.out.println(name);
	}
	
	public static void static_method() {
		System.out.println("I am a static method");
		System.out.println(city);// static method will access only static variables.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static_keyword_usage sku = new static_keyword_usage("yendada","kushal");
		static_keyword_usage sku1 = new static_keyword_usage("seethammadhra","pini");
		sku.get_data();
		static_keyword_usage.static_method();

	}

}
