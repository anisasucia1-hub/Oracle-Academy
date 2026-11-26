import java.util.Scanner;

public class SchoolBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kapasitasBus = 45;

        System.out.print("Masukkan jumlah total orang yang mendaftar: ");
        int totalOrang = scanner.nextInt();

        // Bus hanya digunakan jika terisi penuh (kelipatan 45)
        // Hitung berapa banyak orang yang bisa masuk bus secara penuh
        int orangNaikBus = (totalOrang / kapasitasBus) * kapasitasBus;
        int jumlahBus = totalOrang / kapasitasBus;
        
        // Sisa orang yang tidak memenuhi 1 bus penuh akan naik van
        int orangNaikVan = totalOrang % kapasitasBus;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jumlah bus yang diperlukan : " + jumlahBus);
        System.out.println("Total orang yang naik van  : " + orangNaikVan + " orang");

        scanner.close();
    }
}