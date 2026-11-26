import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // declare variables
        double gallons;
        double liters;

        // Mendapatkan input dari pengguna
        System.out.print("Masukkan jumlah galon yang ingin dikonversi: ");
        gallons = in.nextDouble();

        // Kalkulasi konversi
        liters = gallons * 3.785;

        // Output hasil ke pengguna
        System.out.println(gallons + " gallons equals " + liters + " liters");

        in.close();
    }
}