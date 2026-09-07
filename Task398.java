package java_9;

public class Task398 {
    public class CountUppercase {

        public static int countUpper(String text) {

            if (text.isEmpty()) {
                return 0;
            }

            int count = 0;

            if (Character.isUpperCase(text.charAt(0))) {
                count = 1;
            }

            return count
                    + countUpper(text.substring(1));
        }

        public static void main(String[] args) {

            System.out.println(countUpper("Hello"));
            System.out.println(countUpper("JavaProgram"));
            System.out.println(countUpper("ABC"));
            System.out.println(countUpper("lower"));
        }
    }
}
