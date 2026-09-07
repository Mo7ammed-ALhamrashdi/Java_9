package java_9;

public class Task390 {
    public class CountDigit {

        public static int countDigit(int number, int digit) {

            if (number == 0) {
                return 0;
            }

            int count = 0;

            if (number % 10 == digit) {
                count = 1;
            }

            return count + countDigit(number / 10, digit);
        }

        public static void main(String[] args) {
            System.out.println(countDigit(2222, 2));
            System.out.println(countDigit(12321, 1));
            System.out.println(countDigit(5050, 0));
            System.out.println(countDigit(789, 6));
        }
    }
}
