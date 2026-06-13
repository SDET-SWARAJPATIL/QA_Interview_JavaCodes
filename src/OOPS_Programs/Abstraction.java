package OOPS_Programs;

abstract class ATM {  //abstract class declaration for class and method

    abstract void withdraw(); //abstrcat method

    void checkBalance() {
        System.out.println("Balance: ₹50,000");
    }
}

class SBIATM extends ATM {

    @Override
    void withdraw() {
        System.out.println("₹5000 Withdrawn Successfully");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        SBIATM atm = new SBIATM();

        atm.withdraw();
        atm.checkBalance();
    }
}
