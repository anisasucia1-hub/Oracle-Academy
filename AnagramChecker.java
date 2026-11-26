import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan string pertama: ");
        String str1 = input.nextLine();

        System.out.print("Masukkan string kedua: ");
        String str2 = input.nextLine();

        // Hilangkan spasi dan ubah ke huruf kecil semua, abaikan tanda baca sederhana
        String s1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String s2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isAnagram = false;

        if (s1.length() == s2.length()) {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            isAnagram = Arrays.equals(arr1, arr2);
        }

        if (isAnagram) {
            System.out.println("Hasil: Kedua string MERUPAKAN anagram!");
        } else {
            System.out.println("Hasil: Kedua string BUKAN anagram.");
        }

        input.close();
    }
}