package java_9;

public class Task384 {
    public class CountCharacter {

        public static int countChar(String text, char target) {

            if (text.isEmpty()) {
                return 0;
            }

            int count = 0;

            if (text.charAt(0) == target) {
                count = 1;
            }

            return count + countChar(text.substring(1), target);
        }

        public static void main(String[] args) {

            System.out.println(countChar("banana", 'a'));
        }
    }
}
