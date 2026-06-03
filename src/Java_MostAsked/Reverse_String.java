package Java_MostAsked;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Swaraj gawande";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());// first way
		//second way
		String rev ="";
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

	}

}
