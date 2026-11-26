import java.util.Random;

public class Deck {
    Card[] cardArray = new Card[52];
    int nextCardIndex = 0; // Melacak kartu teratas yang belum dibagikan

    public Deck() { // constructor
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for (int i = 1; i <= suits; i++) {
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }

    // Poin 7a: Method untuk mengacak deck
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cardArray.length; i++) {
            int randomIndex = rand.nextInt(cardArray.length);
            Card temp = cardArray[i];
            cardArray[i] = cardArray[randomIndex];
            cardArray[randomIndex] = temp;
        }
        nextCardIndex = 0; // Reset indeks pembagian setelah diacak
    }

    // Method tambahan untuk mengambil 1 kartu dari deck
    public Card deal() {
        if (nextCardIndex < cardArray.length) {
            return cardArray[nextCardIndex++];
        }
        return null;
    }
}