public class StudentDriver {
    public static void main(String[] args) {
        // Membuat object Student baru (Driver class membuat Student object)
        Student student1 = new Student("Budi Santoso", 24, 3.75);

        // Mencetak informasi tentang object tersebut ke layar
        System.out.println("=== INFORMASI MAHASISWA ===");
        student1.printStudentInfo();
    }
}