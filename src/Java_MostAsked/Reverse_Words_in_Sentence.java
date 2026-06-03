package Java_MostAsked;

public class Reverse_Words_in_Sentence {

	public static void main(String[] args) {

		String s = "My name is swaraj";

		String a[] = s.split(" ");

		String result = "";

		for(String b : a) {

			StringBuffer sb = new StringBuffer(b);

			result = result + sb.reverse().toString() + " ";
		}

		System.out.println(result);
	}
}