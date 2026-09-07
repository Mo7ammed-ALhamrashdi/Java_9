package java_9;

public class Task380 {
    public class SumOfDigits {

        public static int sumDigits(int number) {

            if (number == 0) {
                return 0;
            }

            return number % 10 + sumDigits(number / 10);
        }

        public static void main(String[] args) {
            System.out.println(sumDigits(4021));
        }
    }
}
