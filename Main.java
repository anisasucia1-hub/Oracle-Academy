import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck d = new Deck();

        // Poin 7a: Panggil shuffle dan verifikasi bahwa deck sudah diacak
        d.shuffle();
        System.out.println("=== VERIFIKASI DECK SETELAH DIACAK ===");
        d.print();
        System.out.println("======================================\n");

        // Mulai permainan (menggunakan deck baru yang diacak)
        Deck gameDeck = new Deck();
        gameDeck.shuffle();

        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();

        // Poin 7b: Distribusikan 2 kartu awal ke pemain dan dealer
        playerHand.addCard(gameDeck.deal());
        playerHand.addCard(gameDeck.deal());

        dealerHand.addCard(gameDeck.deal());
        dealerHand.addCard(gameDeck.deal());

        System.out.println("--- KARTU PEMAIN ---");
        playerHand.printHand();

        // Giliran Pemain menambah kartu (maksimal 5 kartu atau poin > 21)
        while (playerHand.numCards < 5 && playerHand.getPoints() <= 21) {
            System.out.print("\nApakah Anda ingin mengambil kartu lagi? (y/n): ");
            String pilihan = scanner.next().toLowerCase();

            if (pilihan.equals("y")) {
                playerHand.addCard(gameDeck.deal());
                System.out.println("\n--- KARTU PEMAIN ---");
                playerHand.printHand();
            } else {
                break;
            }
        }

        int playerPoints = playerHand.getPoints();

        if (playerPoints > 21) {
            System.out.println("\nTotal poin Anda melebihi 21 (Bust)! Anda kalah.");
        } else {
            // Poin 7d: Giliran Dealer (berhenti mengambil kartu jika poin >= 16)
            System.out.println("\n--- GILIRAN DEALER ---");
            while (dealerHand.numCards < 5 && dealerHand.getPoints() < 16) {
                dealerHand.addCard(gameDeck.deal());
            }
            dealerHand.printHand();

            int dealerPoints = dealerHand.getPoints();

            // Penentuan Pemenang
            System.out.println("\n=== HASIL AKHIR ===");
            System.out.println("Poin Pemain : " + playerPoints);
            System.out.println("Poin Dealer : " + dealerPoints);

            if (dealerPoints > 21) {
                System.out.println("Dealer melebihi 21! Selamat, Anda Menang!");
            } else if (playerPoints > dealerPoints) {
                System.out.println("Selamat, Anda Menang!");
            } else if (playerPoints < dealerPoints) {
                System.out.println("Dealer Menang!");
            } else {
                System.out.println("Hasil Seri (Draw)!");
            }
        }

        scanner.close();
    }
}