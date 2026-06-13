package OOPS_Programs;

class Animal{
	void animal() {
		System.out.println("I am from animal class");
	}
}

class Dog extends Animal{
	void dog() {
		System.out.println("I am from dog class");
	}
}

public class Multilevel_Inheritance extends Dog{

	public void puppy() {
		System.out.println("I am from puppy class ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel_Inheritance m = new Multilevel_Inheritance();
		m.animal();
		m.dog();
		m.puppy();

	}

}
