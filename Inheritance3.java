// Program 3.3: Hierarchical Inheritance (Vehicle -> Car & Bike)
public class Inheritance3 {
    static class Vehicle {
        public void fuel() { System.out.println("Runs on fuel/battery."); }
    }

    static class Car extends Vehicle {
        public void doors() { System.out.println("Has 4 doors."); }
    }

    static class Bike extends Vehicle {
        public void kick() { System.out.println("Has kick start."); }
    }

    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.fuel();
        c.doors();
        b.fuel();
        b.kick();
    }
}
