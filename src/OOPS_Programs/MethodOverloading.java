package OOPS_Programs;

class Calculator {  //same class//same method name // diff arguments

    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.add(10, 20);
        cal.add(10, 20, 30);
    }
}
