// Program 4.1: Method Overloading (Compile-Time)
public class Polymorphism1 {
    static class Calculator {
        public int add(int a, int b) { return a + b; }
        public int add(int a, int b, int c) { return a + b + c; }
        public double add(double a, double b) { return a + b; }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 args: " + calc.add(5, 10));
        System.out.println("3 args: " + calc.add(5, 10, 15));
        System.out.println("Double args: " + calc.add(2.5, 3.5));
    }
}
