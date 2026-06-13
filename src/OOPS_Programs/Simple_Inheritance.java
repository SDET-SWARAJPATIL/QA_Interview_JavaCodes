package OOPS_Programs;

class Child{
	public void Method1() {
		System.out.println("I am method1 from child class");
	}
}

public class Simple_Inheritance extends Child {
	
	
	
	public void method2() {
		System.out.println("I am a method from parent class");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Simple_Inheritance i = new Simple_Inheritance();
		//simple inheritance
		i.Method1();//inheritance achived
		i.method2();
	}

}
