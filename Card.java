public class Card {
    String suit, name;
    int points;

    public Card(int n1, int n2) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {
            "Ace", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
        };

        suit = suits[n1 - 1];
        name = names[n2 - 1];

        if (n2 == 1) {
            points = 1;
        } else if (n2 >= 11) {
            points = 10;
        } else {
            points = n2;
        }
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getSuit() {
        return suit;
    }
}