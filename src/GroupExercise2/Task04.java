package GroupExercise2;

import java.util.Arrays;

public class Task04 {
    public static void isAnagrams(String firstString, String secondString) {
        String str1 = firstString.replaceAll("[\\p{Punct}\\s]+", "").toLowerCase();
        String str2 = secondString.replaceAll("[\\p{Punct}\\s]+", "").toLowerCase();

        char[] firstCharArray = str1.toCharArray();
        char[] secondCharArray = str2.toCharArray();

        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        if (str1.length() != str2.length()) {
            System.out.println("Given two strings are NOT Anagrams");
        } else if (Arrays.equals(firstCharArray, secondCharArray)) {
            System.out.println("Given two strings are Anagrams");
        } else {
            System.out.println("Given two strings are NOT Anagrams");
        }
    }

    public static void main(String[] args) {

        isAnagrams("listen", "silent");
        isAnagrams("Listen", "Silent");
        isAnagrams("Hello", "World");
        isAnagrams("Clint Eastwood", "old west action");
    }
}