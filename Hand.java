public class Hand {
    Card[] handCards = new Card[5]; // Poin 7b: Array dari 5 referensi Card
    int numCards = 0;

    public void addCard(Card c) {
        if (numCards < 5 && c != null) {
            handCards[numCards] = c;
            numCards++;
        }
    }

    // Poin 7c: Menghitung poin & menyesuaikan Ace (11 -> 1) jika > 21
    public int getPoints() {
        int totalPoints = 0;
        int aceCount = 0;

        for (int i = 0; i < numCards; i++) {
            totalPoints += handCards[i].points;
            if (handCards[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        // Jika poin lebih dari 21 dan ada Ace, ubah nilai Ace dari 11 menjadi 1 (kurangi 10)
        while (totalPoints > 21 && aceCount > 0) {
            totalPoints -= 10;
            aceCount--;
        }

        return totalPoints;
    }

    public void printHand() {
        for (int i = 0; i < numCards; i++) {
            System.out.println("- " + handCards[i]);
        }
        System.out.println("Total Poin: " + getPoints());
    }
}