public class MainFish {

    // Nomor 7: Membandingkan dua ikan
    public static Fish nicestFish(Fish fish1, Fish fish2) {
        if (fish1.getFriendliness() >= fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
    }

    // Nomor 8: Menerima banyak ikan
    public static Fish nicestFish(Fish... fishes) {
        Fish temp = fishes[0];

        for (Fish fish : fishes) {
            if (fish.getFriendliness() > temp.getFriendliness()) {
                temp = fish;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        // Nomor 6: Membuat dua ikan
        Fish fish1 = new Fish("Amber", "AngelFish", 5);
        Fish fish2 = new Fish("James", "Guppy", 3);

        // Nomor 7
        Fish result1 = nicestFish(fish1, fish2);
        System.out.println("Nicest fish: " + result1.fishName);

        // Nomor 9
        Fish result2 = nicestFish(fish1, fish2);
        System.out.println("Nicest fish from variable arguments: "
                + result2.fishName);
    }
}