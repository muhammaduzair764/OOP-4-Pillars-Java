// Program 2.3: Vehicle Engine Interface
public class Abstraction3 {
    interface VehicleEngine {
        void startEngine();
    }

    static class CarEngine implements VehicleEngine {
        @Override
        public void startEngine() {
            System.out.println("Car Engine started with key ignition.");
        }
    }

    public static void main(String[] args) {
        VehicleEngine engine = new CarEngine();
        engine.startEngine();
    }
}
