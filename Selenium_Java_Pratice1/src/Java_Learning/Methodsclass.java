package Java_Learning;

public class Methodsclass {
	
// public static void main is not required because we are not going to execute this class we are just going to use this class in another executable class to reduce the code repetition
// void is a return type.
//public is an access modifier i.e. we can access this method from any class.
String a = "If there is already a variable in child class with same declaration then to retrieve me we have to use super keyword";// class variable

//public String b;
public Methodsclass(String b) {
	
	
	System.out.println("I am parent class constructor");
	
	
	System.out.println(b);
	
	
	
	
}
public void Validate_Header() {
	
System.out.println("i am a method in another class");
	
}

public String return_class() {
	return "I am method which return string";
}

public void method_overider() {
	
	System.out.println("i am a method which will get overridden by the method of name in the child class");
	
}

public void super_keyword_usage_for_method() {
	
	System.out.println("i am a method in the parent class if there is already same method name in child class then i can be retrieved using super keyword");
	
}
}
