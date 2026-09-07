package java_9;

public class Task381 {
    public class PowerOfTwo {

        public static boolean isPowerOfTwo(int number) {

            if (number == 1) {
                return true;
            }

            if (number <= 0 || number % 2 != 0) {
                return false;
            }

            return isPowerOfTwo(number / 2);
        }

        public static void main(String[] args) {

            System.out.println(isPowerOfTwo(1));
            System.out.println(isPowerOfTwo(8));
            System.out.println(isPowerOfTwo(16));
            System.out.println(isPowerOfTwo(6));
            System.out.println(isPowerOfTwo(20));
        }
    }
}
