package Java_MostAsked;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "naman";
		String original = a;
		String rev ="";
		for(int i = a.length()-1;i>=0;i--) {
			rev = rev + a.charAt(i);
		}
		
		if(original.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");

		}

	}

}
