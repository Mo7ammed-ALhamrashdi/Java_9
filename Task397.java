package java_9;

public class Task397 {
    public class NumberToBinary {

        public static String toBinary(int number) {

            if (number == 0 || number == 1) {
                return String.valueOf(number);
            }

            return toBinary(number / 2)
                    + (number % 2);
        }

        public static void main(String[] args) {

            System.out.println(toBinary(2));
            System.out.println(toBinary(5));
            System.out.println(toBinary(10));
            System.out.println(toBinary(1));
        }
    }
}
