package Java_Learning;

public class encapsulation_main_class extends encapsulation_Child_class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		encapsulation_main_class obj = new encapsulation_main_class();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpSSN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());

	}

}
