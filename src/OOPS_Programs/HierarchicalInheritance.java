package OOPS_Programs;

class Pet_Animal {
    public void animal() {
        System.out.println("I am from Animal");
    }
}

class Cat extends Animal {
    public void cat() {
        System.out.println("I am from Cat");
    }
}

class Cow extends Animal {
    public void cow() {
        System.out.println("I am from Cow");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

    	Cat d = new Cat();
        d.animal();
        d.cat();

        System.out.println();

        Cow c = new Cow();
        c.animal();
        c.cow();
    }
}