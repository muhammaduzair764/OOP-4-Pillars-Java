// Program 3.4: Multiple Inheritance via Interfaces (Printer & Scanner -> Copier)
public class Inheritance4 {
    interface Printer {
        void print();
    }

    interface Scanner {
        void scan();
    }

    static class Copier implements Printer, Scanner {
        @Override
        public void print() { System.out.println("Printing document..."); }

        @Override
        public void scan() { System.out.println("Scanning document..."); }
    }

    public static void main(String[] args) {
        Copier c = new Copier();
        c.print();
        c.scan();
    }
}
