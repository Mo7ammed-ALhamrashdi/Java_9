package java_9;

public class Task389 {
    public class SumEvenNumbers {

        public static int sumEven(int n) {

            if (n <= 0) {
                return 0;
            }

            if (n % 2 == 0) {
                return n + sumEven(n - 1);
            }

            return sumEven(n - 1);
        }

        public static void main(String[] args) {
            System.out.println(sumEven(10));
        }
    }
}
