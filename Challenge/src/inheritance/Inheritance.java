package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();

        babyDog b = new babyDog();
        b.weep();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.meu();
        c.eat();
    }
}
