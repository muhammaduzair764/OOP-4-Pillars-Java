// Program 4.2: Method Overriding (Run-Time)
public class Polymorphism2 {
    static class Animal {
        public void makeSound() { System.out.println("Generic Animal Sound"); }
    }

    static class Cat extends Animal {
        @Override
        public void makeSound() { System.out.println("Meow!"); }
    }

    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.makeSound(); // Dynamic binding calls Cat's version
    }
}
