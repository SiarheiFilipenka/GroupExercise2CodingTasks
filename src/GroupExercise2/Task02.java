package GroupExercise2;

public class Task02 {
    public static void isPalindrome(String str) {
        String str2 = str.replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder(str2);
        if (str.replaceAll("\\s", "").equalsIgnoreCase(sb.reverse().toString())) {
            System.out.println("Given string is Palindrome");
        } else {
            System.out.println("Given string is NOT Palindrome");
        }
    }

    public static void main(String[] args) {

        isPalindrome("Madam");
        isPalindrome("John");
        isPalindrome("taco cat");
        isPalindrome("UFO tofu");
    }
}