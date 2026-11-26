public class MainStudent {
    public static void main(String[] args) {
        // Nomor 5: Membuat tiga instance Student
        Student student1 = new Student("Mary Jones", 14, 46);
        Student student2 = new Student("John Stiner", 60, 173);
        Student student3 = new Student("Ari Samala", 31, 69);

        System.out.println(student1.nama + " memiliki IP "
                + student1.hitungIP());

        System.out.println(student2.nama + " memiliki IP "
                + student2.hitungIP());

        System.out.println(student3.nama + " memiliki IP "
                + student3.hitungIP());

        // Nomor 6: Menambahkan kredit dan poin mutu Ari Samala
        student3.tambahNilai(13, 52);

        System.out.println("\nSetelah penambahan:");
        System.out.println("Nama: " + student3.nama);
        System.out.println("Kredit: " + student3.kredit);
        System.out.println("Poin mutu: " + student3.poinMutu);
        System.out.println("IP baru: " + student3.hitungIP());
    }
}