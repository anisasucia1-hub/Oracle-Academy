import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.println("Masukkan 10 angka rahasia satu per satu (angka 1 sampai 7):");

        while (count < 10) {
            // Ditambah spasi dan titik dua agar rapi
            System.out.print("Masukkan angka ke-" + (count + 1) + ": ");
            int angka = input.nextInt();

            char huruf = ' ';
            boolean valid = true;

            switch (angka) {
                case 1: huruf = 'D'; break;
                case 2: huruf = 'W'; break;
                case 3: huruf = 'E'; break;
                case 4: huruf = 'L'; break;
                case 5: huruf = 'H'; break;
                case 6: huruf = 'O'; break;
                case 7: huruf = 'R'; break;
                default:
                    System.out.println("-> Angka belum terpecahkan! Silakan masukkan angka baru (1-7).");
                    valid = false;
            }

            if (valid) {
                // Cetak hurufnya, lalu beri jeda/baris baru agar tidak menempel dengan teks berikutnya
                System.out.println("   --> Huruf terdeteksi: " + huruf);
                count++;
            }
        }

        System.out.println("\nPesan rahasia berhasil diuraikan sepenuhnya!");
        input.close();
    }
}