package Java_Learning;

public class While_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while loops required decrementer or incrementer everytime
		
		/* Basic difference between while and do while loop
		 * while loop will first validate the condition first and then execute the statements inside the loop
		 * 
		 * Do while loop will execute first and then vvalidate the statement that means one loop execute will be done for sure.
		 * */
		
		int i = 0;
		int j =10;
		int k = 0;
		while(i<10) {
			
			//System.out.println(i);
			i = i+1;
		}
		
		while(j>0) {
			//System.out.println(j);
			j= j-1;
			
		}
		
		do {
			System.out.println(k);
			
		}while(k>0);
		
		while(k>0) {
			System.out.println(k); // this will not be printed because while will validate the condition first which in this case it is false and then execute the block of code
		}

	}

}
