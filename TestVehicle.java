public class TestVehicle {
    public static void main(String[] args) {

        // Nomor 1: Menampilkan static variables
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: "
                + Vehicle.numVehicles);

        // Membuat vehicle pertama
        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1.toString());

        // Membuat vehicle kedua
        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2.toString());

        // Nomor 2: Mengubah static variable MAKE
        vehicle2.setMake("Seer");

        // Menampilkan kedua vehicle setelah MAKE berubah
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        // Nomor 4: Membuat Engine yang mewarisi Vehicle
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");

        // Menampilkan informasi vehicle3
        System.out.println("Vehicle number "
                + vehicle3.getChassisNo()
                + " is a " + vehicle3.getModel()
                + " model and has an engine capacity of "
                + Vehicle.Engine.getCapacity() + "cc");

        // Menampilkan total kendaraan
        System.out.println("Number of vehicles manufactured: "
                + Vehicle.numVehicles);
    }
}