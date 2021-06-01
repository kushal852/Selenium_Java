package Java_Learning;

public class abstract_child_class extends abstract_parent_class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstract_child_class acc=  new abstract_child_class();
		
		acc.engineRules();
		acc.safetyRules();
		// since aircraft colour is abstract method it will not have implementation and implementation should be in child class which extending the abstract parent class
		acc.aircraft_colour();
		
	}

	@Override
	public void aircraft_colour() {
		// TODO Auto-generated method stub
		
		System.out.println("Colour can be red");
		
	}

}
