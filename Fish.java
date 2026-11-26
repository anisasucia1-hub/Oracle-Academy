public class Fish {
    // Nomor 1: Instance variables
    String typeOfFish;
    int friendliness;

    // Tambahan nomor 6: Nama ikan
    String fishName;

    // Nomor 2: Constructor tanpa argument
    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    // Nomor 3: Constructor dengan dua argument
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // Nomor 6: Constructor dengan nama, jenis, dan keramahan
    public Fish(String name, String t, int f) {
        fishName = name;
        typeOfFish = t;
        friendliness = f;
    }

    // Nomor 5: Method getFriendliness
    public int getFriendliness() {
        return friendliness;
    }
}