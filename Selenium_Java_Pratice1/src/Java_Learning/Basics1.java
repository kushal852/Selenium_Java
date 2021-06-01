package Java_Learning;

public class Basics1 extends Methodsclass {

	int a= 20;

    public Basics1(String b) {
		
		super(b);// passing the variable from child class to the parent class , the super keyword should always be in the first line
		System.out.println("i am child class constructor");
	}
	//Method overloading
	//String a ="I will be first prefered over since i am in child class";
	
	
	public void get_data(int a, int b) {
		System.out.println(b);
	}
	public void get_data() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
	}
	public void get_data(String a) {
	
		System.out.println(a);
	}
	public void super_keyword_usage_for_variable() {
		System.out.println(a);// child class will give preference to this variable.
		System.out.println(super.a);// the variable name with same declaration in parent class can be retrieved like this.
	}
	
	public void super_keyword_usage_for_method() {
		System.out.println("i am a method in the child class if there is already same method name in parent class i will be preferred first");// child class will give preference to this variable.
		super.super_keyword_usage_for_method();// the method name with same declaration in parent class can be retrieved like this.
	}
	
	
	

	//Method overriding
	public void method_overider() {
		System.out.println("I have the overridden the method with same name in the parent class since i will be given first priority since i am local");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.out.println("this is java basics");
		
		int a = 2, b= 3;
		
		System.out.println("sum is "+(a+b));
		*/
		
		
		Basics1 M = new Basics1("ab"); // creation of a object for the Methodsclass
		// in python there is no need to new keyword just M = Methodsclass() is enough
		M.Validate_Header(); // Invoking the method inside the Methodsclass.
		System.out.println(M.return_class());
		//System.out.println(M.a);
		M.get_data();
		M.get_data("this is a method overloading scenario");
		M.get_data(1, 2);
		M.method_overider();
		M.super_keyword_usage_for_variable();
		M.super_keyword_usage_for_method();
		
		
	}

}
