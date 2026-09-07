package java_9;

public class Task395 {
    public class ContainsCharacter {

        public static boolean contains(String text, char target) {

            if (text.isEmpty()) {
                return false;
            }

            if (text.charAt(0) == target) {
                return true;
            }

            return contains(text.substring(1), target);
        }

        public static void main(String[] args) {

            System.out.println(contains("hello", 'e'));
            System.out.println(contains("world", 'z'));
            System.out.println(contains("java", 'a'));
            System.out.println(contains("", 'x'));
        }
    }
}
