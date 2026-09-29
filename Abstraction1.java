// Program 2.1: Abstract Shape Class
public class Abstraction1 {
    abstract static class Shape {
        public abstract void draw();
    }

    static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
