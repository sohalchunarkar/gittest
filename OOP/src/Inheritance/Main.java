package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.food();
        Animal a1 = new Animal();
        a1.food();
        // a1.bark();

        Dog d2 = new Dog(); // inheritance
        d2.bark();
        d2.walk();
    }
}
