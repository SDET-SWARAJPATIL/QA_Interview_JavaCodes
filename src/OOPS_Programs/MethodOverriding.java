package OOPS_Programs;

class Vehicle {

    public void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started with Key");
    }
}

class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started with Self");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}