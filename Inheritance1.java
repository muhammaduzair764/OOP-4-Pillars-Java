// Program 3.1: Single Inheritance (Animal -> Dog)
public class Inheritance1 {
    static class Animal {
        public void eat() { System.out.println("Eating..."); }
    }

    static class Dog extends Animal {
        public void bark() { System.out.println("Barking..."); }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
