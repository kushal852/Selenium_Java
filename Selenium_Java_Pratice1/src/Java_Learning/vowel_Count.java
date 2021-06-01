package Java_Learning;

public class vowel_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "kushal gupta";
		int count = 0;
		
		for (int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			if(ch=='a' || ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u') {
				
				count = count + 1;
				
			}
			
		}
		
		System.out.println(count);
		
		

	}

}
