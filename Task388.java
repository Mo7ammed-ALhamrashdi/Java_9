package java_9;

public class Task388 {
    public class PrintStringReverse {

        public static void printReverse(String text) {

            if (text.isEmpty()) {
                return;
            }

            printReverse(text.substring(1));

            System.out.println(text.charAt(0));
        }

        public static void main(String[] args) {
            printReverse("hello");
        }
    }
}
