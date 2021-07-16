package Polymorphism;

public class TestPolymorphism{
    public static void main(String[] args) {
        Bank b;
        b = new PNC();
        System.out.println("The PNC interest rate is " + b.getInterestRate());
    }


}
