// Program 4.4: Polymorphic Base Reference Array
public class Polymorphism4 {
    abstract static class BaseArea {
        public abstract void calculate();
    }

    static class Square extends BaseArea {
        @Override
        public void calculate() { System.out.println("Area of Square = side * side"); }
    }

    static class Rectangle extends BaseArea {
        @Override
        public void calculate() { System.out.println("Area of Rectangle = length * width"); }
    }

    public static void main(String[] args) {
        BaseArea[] shapes = new BaseArea[2];
        shapes[0] = new Square();
        shapes[1] = new Rectangle();

        for (BaseArea shape : shapes) {
            shape.calculate();
        }
    }
}
