package Java_Learning;

public class indian_traffic_class implements worldwidetrafficrules,continentaltrafficrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to access the methods inside interfaces using the class
		worldwidetrafficrules wt = new indian_traffic_class();
		wt.GreenLight();
		wt.yellowlight();
		wt.redlight();
		// specific object should be created for each interface to access the methods inside it. 
		continentaltrafficrules ct = new indian_traffic_class();
		ct.walkingsymbol();
		// to access the methods in this class we have create object for this class
		indian_traffic_class it = new indian_traffic_class();
		it.fines();
		
		

	}
	
	// class specific method
	public void fines() {
		
		System.out.println("citizens will be fines if they does not obey the traffic rules");
	}

	@Override
	public void walkingsymbol() {
		// TODO Auto-generated method stub
		
		System.out.println("pedistirans can walk");
		
	}

	@Override
	public void GreenLight() {
		// TODO Auto-generated method stub
		
		System.out.println("vehicles can move");
		
	}

	@Override
	public void yellowlight() {
		// TODO Auto-generated method stub
		System.out.println("vehicles should slow down to stop for red light");
	}

	@Override
	public void redlight() {
		// TODO Auto-generated method stub
		System.out.println("vehicles should stop for red light");
	}

}
