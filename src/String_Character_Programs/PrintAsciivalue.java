package String_Character_Programs;

public class PrintAsciivalue {
	public static void main(String[] args) {

		String s = "My name is swaraj";



		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			System.out.println((int)c);

		}

	}
}
