package Java_MostAsked;

public class String_Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java Programming";
		String s2 = "Hello World";
		
		String a [] = s1.split(" ");
		String b [] = s2.split(" ");
		
		String temp = a[0];//temp = java
		a[0] = b[0];//a[0] = hello
		b[0] = temp;//b[0] = java
		
		System.out.println(a[0] + " " + a[1]);
		System.out.println(b[0] + " " + b[1]);
		

	}

}
