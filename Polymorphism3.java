// Program 4.3: Custom Method Overloading Simulation (Complex Number Addition)
public class Polymorphism3 {
    static class Complex {
        private int real, imag;

        public Complex(int r, int i) {
            this.real = r;
            this.imag = i;
        }

        public Complex add(Complex obj) {
            return new Complex(this.real + obj.real, this.imag + obj.imag);
        }

        public void display() {
            System.out.println(real + " + " + imag + "i");
        }
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);
        Complex c3 = c1.add(c2);
        c3.display();
    }
}
