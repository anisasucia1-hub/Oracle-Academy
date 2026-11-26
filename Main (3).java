import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Student mahasiswa = new Student(
            "Plin",
            "Plan",
            "Plun",
            new Date(),
            "123456",
            "Teknik Informatika",
            "Sarjana",
            2027
        );

        // Menampilkan data mahasiswa
        System.out.println("Nama: " + mahasiswa.getName());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());

        // Mengubah jurusan
        mahasiswa.changeMajor("Sistem Informasi");

        System.out.println("Jurusan Baru: " + mahasiswa.getJurusan());

        // Menghitung IP
        String[] nilai = {"A", "B+", "A-", "B"};

        System.out.println(
            "IP Mahasiswa: " + mahasiswa.calculateIP(nilai)
        );
    }
}