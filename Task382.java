package java_9;

public class Task382 {
    public class RecursiveEven {

        public static boolean isEven(int number) {

            if (number == 0) {
                return true;
            }

            if (number == 1) {
                return false;
            }

            return isEven(number - 2);
        }

        public static void main(String[] args) {

            System.out.println(isEven(8));
            System.out.println(isEven(7));
            System.out.println(isEven(100));
        }
    }
}
