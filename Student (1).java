public class Student extends Person {

    private String nim;
    private double ip;
    private String jurusan;
    private String gelar;
    private int tahunKelulusan;

    public Student(String firstName, String middleName,
                   String lastName, java.util.Date dateOfBirth,
                   String nim, String jurusan,
                   String gelar, int tahunKelulusan) {

        super(firstName, middleName, lastName, dateOfBirth);

        this.nim = nim;
        this.jurusan = jurusan;
        this.gelar = gelar;
        this.tahunKelulusan = tahunKelulusan;
    }

    public String getNim() {
        return nim;
    }

    public double getIp() {
        return ip;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getGelar() {
        return gelar;
    }

    public int getTahunKelulusan() {
        return tahunKelulusan;
    }

    // Method untuk mengubah jurusan mahasiswa
    public void changeMajor(String jurusan) {
        this.jurusan = jurusan;
    }

    // Method untuk menghitung IP mahasiswa
    public double calculateIP(String[] nilai) {
        double total = 0;

        for (String n : nilai) {
            switch (n) {
                case "A":
                    total += 4.0;
                    break;
                case "A-":
                    total += 3.67;
                    break;
                case "B+":
                    total += 3.33;
                    break;
                case "B":
                    total += 3.0;
                    break;
                case "B-":
                    total += 2.67;
                    break;
                case "C+":
                    total += 2.33;
                    break;
                case "C":
                    total += 2.0;
                    break;
                case "D":
                    total += 1.0;
                    break;
                case "F":
                    total += 0.0;
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Nilai tidak valid: " + n
                    );
            }
        }

        ip = total / nilai.length;
        return ip;
    }
}