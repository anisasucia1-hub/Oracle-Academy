import java.util.Scanner;

public class KalkulatorMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];
        boolean adaA = false, adaB = false;
        char pilihan;

        do {
            System.out.println("\n=== MENU KALKULATOR MATRIKS 2x2 ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih menu (a-f): ");
            pilihan = scanner.next().toLowerCase().charAt(0);

            switch (pilihan) {
                case 'a':
                    System.out.println("Masukkan elemen Matriks A (2x2):");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print("A[" + i + "][" + j + "]: ");
                            matriksA[i][j] = scanner.nextInt();
                        }
                    }
                    adaA = true;
                    break;

                case 'b':
                    System.out.println("Masukkan elemen Matriks B (2x2):");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print("B[" + i + "][" + j + "]: ");
                            matriksB[i][j] = scanner.nextInt();
                        }
                    }
                    adaB = true;
                    break;

                case 'c':
                    if (!adaA || !adaB) {
                        System.out.println("⚠️ Masukkan Matriks A dan B terlebih dahulu!");
                        break;
                    }
                    System.out.println("Hasil Penjumlahan (A + B):");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print((matriksA[i][j] + matriksB[i][j]) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 'd':
                    if (!adaA || !adaB) {
                        System.out.println("⚠️ Masukkan Matriks A dan B terlebih dahulu!");
                        break;
                    }
                    System.out.println("Hasil Pengurangan (A - B):");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print((matriksA[i][j] - matriksB[i][j]) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 'e':
                    if (!adaA || !adaB) {
                        System.out.println("⚠️ Masukkan Matriks A dan B terlebih dahulu!");
                        break;
                    }
                    int[][] hasilKali = new int[2][2];
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            hasilKali[i][j] = 0;
                            for (int k = 0; k < 2; k++) {
                                hasilKali[i][j] += matriksA[i][k] * matriksB[k][j];
                            }
                        }
                    }
                    System.out.println("Hasil Perkalian (A * B):");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(hasilKali[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 'f':
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 'f');

        scanner.close();
    }
}