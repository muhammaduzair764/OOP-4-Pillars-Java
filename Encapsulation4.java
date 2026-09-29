// Program 1.4: Temperature Converter with Read-Only State
public class Encapsulation4 {
    static class Temperature {
        private double celsius;

        public void setCelsius(double c) { celsius = c; }
        public double getCelsius() { return celsius; }
        public double getFahrenheit() { return (celsius * 9.0 / 5.0) + 32; }
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.setCelsius(25.0);
        System.out.println("Celsius: " + t.getCelsius() + " C");
        System.out.println("Fahrenheit: " + t.getFahrenheit() + " F");
    }
}
