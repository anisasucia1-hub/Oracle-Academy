public class Vehicle {
    // Static variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Instance variables
    private String chassisNo;
    private String model;

    // Constructor Vehicle
    public Vehicle(String model) {
        numVehicles++;
        this.chassisNo = "ch" + numVehicles;
        this.model = model;

        System.out.println("Vehicle manufactured");
    }

    // Getter dan setter chassisNo
    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    // Getter dan setter model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter dan setter MAKE
    public static String getMake() {
        return MAKE;
    }

    public void setMake(String make) {
        MAKE = make;
    }

    // Nomor 3 dan 4: Nested static class Engine
    public static class Engine extends Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // Constructor Engine
        public Engine(String model) {
            super(model);
        }

        // Getter MAKE mesin
        public static String getMake() {
            return MAKE;
        }

        // Getter kapasitas mesin
        public static int getCapacity() {
            return CAPACITY;
        }
    }

    // Method toString
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE
                + "\nThe model type is " + model
                + "\nThe chassis number is " + chassisNo
                + "\nThe engine is manufactured by: " + Engine.getMake()
                + "\nThe engine capacity is: " + Engine.getCapacity();
    }
}