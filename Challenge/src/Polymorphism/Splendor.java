package Polymorphism;

public class Splendor extends Bike {
    void run(){
        System.out.println("running safely with 60KM");
    }

    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
}
