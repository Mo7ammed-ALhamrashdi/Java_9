package java_9;

public class Task379 {
    public class StringLength {

        public static int length(String text) {

            if (text.isEmpty()) {
                return 0;
            }

            return 1 + length(text.substring(1));
        }

        public static void main(String[] args) {
            System.out.println(length("hello"));
        }
    }
}
