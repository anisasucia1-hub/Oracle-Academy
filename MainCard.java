import java.util.Scanner;

public class MainCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] hand = new Card[5];
        int totalPoints = 0;
        int numberOfCards = 0;
        String answer = "yes";

        // Nomor 7: Membuat dua kartu acak
        while (numberOfCards < 2) {
            int suitNumber = (int)(Math.random() * 4) + 1;
            int faceNumber = (int)(Math.random() * 13) + 1;

            hand[numberOfCards] = new Card(suitNumber, faceNumber);
            totalPoints += hand[numberOfCards].getPoints();

            System.out.println("Card " + (numberOfCards + 1) + ": "
                    + hand[numberOfCards]);
            numberOfCards++;
        }

        System.out.println("Total points: " + totalPoints);

        // Nomor 8: Menambah kartu sampai kondisi berhenti terpenuhi
        while (totalPoints <= 21
                && numberOfCards < 5
                && answer.equalsIgnoreCase("yes")) {

            System.out.print("Do you want another card? (yes/no): ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                int suitNumber = (int)(Math.random() * 4) + 1;
                int faceNumber = (int)(Math.random() * 13) + 1;

                hand[numberOfCards] =
                        new Card(suitNumber, faceNumber);

                totalPoints += hand[numberOfCards].getPoints();

                System.out.println("New card: "
                        + hand[numberOfCards]);

                numberOfCards++;

                System.out.println("Your hand:");

                for (int i = 0; i < numberOfCards; i++) {
                    System.out.println(hand[i] + " - "
                            + hand[i].getPoints() + " points");
                }

                System.out.println("Total points: " + totalPoints);

                if (totalPoints > 21) {
                    System.out.println("Bust! Total points exceed 21.");
                } else if (numberOfCards == 5) {
                    System.out.println("You have reached 5 cards.");
                }
            } else if (!answer.equalsIgnoreCase("no")) {
                System.out.println("Please enter yes or no.");
                answer = "yes";
            }
        }

        System.out.println("Final total points: " + totalPoints);
        System.out.println("Number of cards: " + numberOfCards);

        input.close();
    }
}