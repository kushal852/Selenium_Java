package Java_Learning;

public class nested_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k  = 1;
		for(int i=0;i<=4;i++) {
			
			
			for(int j=1;j<=4-i;j++) {
				
			    System.out.print(k);
			    System.out.print(" ");
			    k=k+1;
			    
			}
			
			System.out.println("");
			
			
			
			
			
		}
		
		int c  = 1;
		for(int i=0;i<=4;i++) {
			
			
			for(int j=1;j<=i;j++) {
				
			    System.out.print(c);
			    System.out.print(" ");
			    c=c+1;
			    
			}
			
			System.out.println("");	
			
		}
		
		int m  = 3;
		for(int i=0;i<=4;i++) {
			
			
			for(int j=1;j<i;j++) {
				
			    System.out.print(m);
			    System.out.print(" ");
			    m=m+3;
			    
			}
			
			System.out.println("");
			
			
			
			
			
		}

	}

}
