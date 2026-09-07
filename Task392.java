package java_9;

public class Task392 {
    public class RemoveCharacter {

        public static String removeChar(String text, char target) {

            if (text.isEmpty()) {
                return "";
            }

            if (text.charAt(0) == target) {
                return removeChar(text.substring(1), target);
            }

            return text.charAt(0)
                    + removeChar(text.substring(1), target);
        }

        public static void main(String[] args) {

            System.out.println(removeChar("banana", 'a'));
            System.out.println(removeChar("hello", 'l'));
            System.out.println(removeChar("mississippi", 's'));
            System.out.println(removeChar("abc", 'z'));
        }
    }
}
