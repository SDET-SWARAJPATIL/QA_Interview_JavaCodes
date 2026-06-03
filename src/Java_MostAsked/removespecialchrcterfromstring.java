package Java_MostAsked;

public class removespecialchrcterfromstring {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "S@1!@#w__a raj";
		String b = s.replace(" ", "");
		String c = s.replaceAll("[^a-zA-Z]","");
		System.out.println(c);
	}
}
