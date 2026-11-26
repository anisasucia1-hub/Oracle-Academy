import java.util.Scanner;

public class HitungCat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = input.nextDouble();

        // Luas 4 dinding + langit-langit (lantai tidak dicat)
        double luasTotal = 2 * (panjang * tinggi) + 2 * (lebar * tinggi) + (panjang * lebar);

        // Hitung jumlah ember 5 liter (1.500 kaki persegi per ember)
        int ember5Liter = (int) (luasTotal / 1500);
        double sisaLuas = luasTotal % 1500;

        // Hitung jumlah ember 1 liter untuk sisa luas (300 kaki persegi per ember)
        int ember1Liter = (int) Math.ceil(sisaLuas / 300.0);

        // Optimasi biaya: jika butuh >= 4 ember 1 liter ($16), lebih murah beli 1 ember 5 liter ($15)
        if (ember1Liter >= 4) {
            ember5Liter++;
            ember1Liter = 0;
        }

        int totalHarga = (ember5Liter * 15) + (ember1Liter * 4);

        System.out.printf("\nTotal luas yang harus dicat: %.2f kaki persegi\n", luasTotal);
        System.out.println("Jumlah optimal yang harus dibeli:");
        System.out.println("- Ember 5 liter : " + ember5Liter + " kaleng ($" + (ember5Liter * 15) + ")");
        System.out.println("- Ember 1 liter : " + ember1Liter + " kaleng ($" + (ember1Liter * 4) + ")");
        System.out.println("Total biaya     : $" + totalHarga);

        input.close();
    }
}