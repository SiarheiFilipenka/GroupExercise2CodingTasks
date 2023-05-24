package GroupExercise2;

public class Task05 {

    public static char firstNonRepChar(String givenString) {
        char[] chars = givenString.replaceAll("[\\p{Punct}\\s]+", "").toLowerCase().toCharArray();

        System.out.print("The first non-repeating character is: ");

        char nonRepChar = ' ';

        for (int i = 0; i < chars.length; i++) {
            boolean isRepeating = false;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[i]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                nonRepChar = chars[i];
                break;
            }
        }
        return nonRepChar;
    }

    public static void main(String[] args) {

        System.out.println(firstNonRepChar("abracadabra"));
        System.out.println(firstNonRepChar("Hello"));
        System.out.println(firstNonRepChar("little"));
        System.out.println(firstNonRepChar("Train"));
    }
}