package Java_Learning;

public class Basic_Logical_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Palindrome
		String c = "Kushal";
        System.out.println(c.charAt(c.length()-1));
		
		String b = "";
		int count = c.length()-1;
		
		for (int i=0;i<c.length();i++) {
			
			b = b+ c.charAt(count);
			
			count = count -1;
			
			
		}
		
		System.out.println(b);
	}

}
