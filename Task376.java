package java_9;

public class Task376 {
    public class PrintNumbers {

        public static void printUp(int n) {

            if (n <= 0) {
                return;
            }

            printUp(n - 1);

            System.out.println(n);
        }

        public static void main(String[] args) {
            printUp(5);
        }
    }
}
