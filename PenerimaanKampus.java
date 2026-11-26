import java.util.Scanner;

public class PenerimaanKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah Anda valedictorian atau salutatorian? (true/false): ");
        boolean peringkatTerbaik = input.nextBoolean();

        System.out.print("Masukkan jumlah siswa di sekolah Anda: ");
        int jumlahSiswa = input.nextInt();

        System.out.print("Masukkan nilai GPA Anda: ");
        double gpa = input.nextDouble();

        System.out.print("Masukkan skor SAT Anda: ");
        int sat = input.nextInt();

        boolean syarat1 = peringkatTerbaik && jumlahSiswa >= 1400;
        boolean syarat2 = gpa >= 4.0 && sat >= 1100;
        boolean syarat3 = gpa >= 3.5 && sat >= 1300;
        boolean syarat4 = gpa >= 3.0 && sat >= 1500;

        if (syarat1 || syarat2 || syarat3 || syarat4) {
            System.out.println("Selamat! Anda diterima di Mountville University.");
        } else {
            System.out.println("Maaf, Anda belum memenuhi kriteria penerimaan.");
        }

        input.close();
    }
}