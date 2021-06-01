package Java_Learning;

public class Constructor_demo {

	/* CONSTRUCTOR RULES
	 * Constructor name should be same has the class
	 * constructor will not return any parameters.
	 * */
		
		public Constructor_demo(){
			
			System.out.println("this is constructor without parmeters");	
		}
		
		// constructors with parameters.
        public Constructor_demo(int a, int b){
			
			System.out.println("this is constructor with parmeters");	
		}
		
        public void method() {
        	System.out.println("I am normal method with a return type.");
        }
        
        
        
public static void main(String[] args) {
	
	Constructor_demo cd = new Constructor_demo();
    Constructor_demo cda = new Constructor_demo(2,3);
        	
            cd.method();
        }
        
	}


