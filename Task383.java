package java_9;

public class Task383 {
    public class RecursivePalindrome {

        public static boolean isPalindrome(String word) {

            if (word.length() <= 1) {
                return true;
            }

            if (word.charAt(0) != word.charAt(word.length() - 1)) {
                return false;
            }

            return isPalindrome(
                    word.substring(1, word.length() - 1)
            );
        }

        public static void main(String[] args) {

            System.out.println(isPalindrome("level"));
            System.out.println(isPalindrome("madam"));
            System.out.println(isPalindrome("hello"));
        }
    }
}
