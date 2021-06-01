package Java_Learning;

public class Multi_dimensional_arrrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// two rows , three columns
		// declaration of multidimensional array using array object.
		/*int a[][] = new int[2][3];
		
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 6;
		a[1][0] = 8;
		a[1][1] = 10;
		a[1][2] = 12;*/
		
		int b[][] = {{1,2,3},{4,5,6},{8,-1,100}};
		
		for(int i =0;i<b.length;i++) {
			
			for(int j=0;j<b[i].length;j++) {
				
				System.out.print(b[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
			
		}
		
		// declaration of multidimensional array using array literal
		
		
		
		
		int min= b[0][0];
		int max = b[0][0];
		int min_col = 0;
		int max_col = 0;
		
		
       for(int i =0;i<b.length;i++) {
			
			for(int j=0;j<b[i].length;j++) {
				
				if (b[i][j]<min) {
					min = b[i][j];
					min_col = j;
				}	
				
				if(b[i][j]>max) {
					max= b[i][j];	
					max_col = j;
				}
			}
				
		}
       
       
       System.out.print("Minimum number in the two dimensional array : ");
       System.out.print(min);
       System.out.println("");
       System.out.print("Maximum number in the two dimensional array : ");
       System.out.print(max);
       System.out.println("");
       
      
   // print the maximum number in the column which is have minimum number
       int k = b[0][min_col];
       
       for(int i =0;i<b.length;i++) {
			if(b[i][min_col]>k) {
			k = b[i][min_col];
			}
       }
       
       System.out.println(k);    
       
  // print the minimum number in the column which is have maximum number
       int m = b[0][max_col];
       
       for(int i =0;i<b.length;i++) {
			if(b[i][max_col]<m) {
			m = b[i][max_col];
			}
      }
      
      System.out.println(m); 
       
       
		
	}

}
