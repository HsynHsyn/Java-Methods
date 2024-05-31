package Preparing.Day13_Methods;

import java.util.Scanner;

public class NewTask_Vowel_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.nextLine();
        System.out.println("Check if all the characters of the given string are vowels or not!");
        boolean result = areAllCharactersVowels(str);
        System.out.println(result);
    }

    public static boolean areAllCharactersVowels(String input) {
        String vowels = "aeiou";
        String phrase = input.toLowerCase(); // Girdi küçük harfe dönüştürülüyor
        for (int i = 0; i < phrase.length(); i++) {
            if (vowels.indexOf(phrase.charAt(i)) == -1) {
                return false; // Eğer karakter vowels içinde yoksa, false döner
            }
        }
        return true; // Eğer döngü boyunca tüm karakterler vowels içinde bulunmuşsa, true döner
    }
}

