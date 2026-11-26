
public class MainAnimal {
    public static void main(String[] args) {
        // Nomor 3: Membuat dua instance Animal
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(70, 5, 10);

        System.out.println("Animal #1 memiliki kecepatan "
                + animal1.getSpeed());

        System.out.println("Animal #2 memiliki kecepatan "
                + animal2.getSpeed());
    }
}