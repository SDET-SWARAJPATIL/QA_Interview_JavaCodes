package Java_MostAsked;

import java.util.Arrays;

public class Anagram_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "silenta";
		String b = "listen";
		if(a.length() != b.length()) {
			System.out.println("not anagram");
			}else {
			char[] c = a.toCharArray();
			char[] d = b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			if(Arrays.equals(c, d)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");

			}
		
		
			}

	}

}
