public class Student {
    // Instance variables
    String nama;
    int kredit;
    int poinMutu;

    // Constructor
    public Student(String nama, int kredit, int poinMutu) {
        this.nama = nama;
        this.kredit = kredit;
        this.poinMutu = poinMutu;
    }

    // a. Menghitung IP (poin mutu dibagi kredit)
    public double hitungIP() {
        return (double) poinMutu / kredit;
    }

    // b. Memperbarui kredit dan poin mutu
    public void tambahNilai(int kreditBaru, int poinMutuBaru) {
        kredit += kreditBaru;
        poinMutu += poinMutuBaru;
    }
}