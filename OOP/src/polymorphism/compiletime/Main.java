package polymorphism.compiletime;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.food();// compile time polymorphism depend on object type
        Dog d1 = new Dog();
        d1.food();

    }
}
