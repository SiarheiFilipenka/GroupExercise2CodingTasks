package GroupExercise2;

public class Task03 {
    public static int numberOfWords(String str) {
        if (str.isEmpty()) {
            return 0;
        } else {
            String[] strArr = str.split("[\\p{Punct}\\s]+");
            return strArr.length;
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfWords("Hello, world!"));
        System.out.println(numberOfWords("Hi! How are you doing?"));
        System.out.println(numberOfWords("For example, the input \"Hello, world!\" should return 2."));
        System.out.println(numberOfWords(""));
    }
}