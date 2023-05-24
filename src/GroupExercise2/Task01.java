package GroupExercise2;

public class Task01 {
    public static String reversedString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(reversedString("Hello"));
    }
}
