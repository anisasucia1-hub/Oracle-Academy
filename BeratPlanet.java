import java.util.Scanner;

public class BeratPlanet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat Anda di Bumi (lbs): ");
        double beratBumi = input.nextDouble();

        System.out.println("\nPilih planet tujuan:");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");
        System.out.print("Masukkan pilihan (1-7): ");
        int pilihan = input.nextInt();

        String namaPlanet = "";
        double faktor = 0;

        switch (pilihan) {
            case 1: namaPlanet = "Merkurius"; faktor = 0.38; break;
            case 2: namaPlanet = "Venus";     faktor = 0.91; break;
            case 3: namaPlanet = "Mars";      faktor = 0.38; break;
            case 4: namaPlanet = "Jupiter";   faktor = 2.36; break;
            case 5: namaPlanet = "Saturnus";  faktor = 0.92; break;
            case 6: namaPlanet = "Uranus";    faktor = 0.89; break;
            case 7: namaPlanet = "Neptunus";  faktor = 1.13; break;
            default:
                System.out.println("Pilihan tidak valid!");
                input.close();
                return;
        }

        double beratPlanet = beratBumi * faktor;
        System.out.printf("Your weight on %s is %.2f lbs.\n", namaPlanet, beratPlanet);

        input.close();
    }
}