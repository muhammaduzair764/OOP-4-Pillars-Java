// Program 2.2: Appliance Power Interface
public class Abstraction2 {
    interface Appliance {
        void turnOn();
        void turnOff();
    }

    static class Fan implements Appliance {
        @Override
        public void turnOn() { System.out.println("Fan is spinning."); }

        @Override
        public void turnOff() { System.out.println("Fan has stopped."); }
    }

    public static void main(String[] args) {
        Appliance myFan = new Fan();
        myFan.turnOn();
        myFan.turnOff();
    }
}
