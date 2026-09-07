package java_9;
public class Task375 {
    public class CountDownAndCountUp {

        public static void countDownUp(int n) {

            if (n <= 0) {
                return;
            }

            System.out.println(n);

            if (n > 1) {
                countDownUp(n - 1);
                System.out.println(n);
            }
        }

        public static void main(String[] args) {
            countDownUp(4);
        }
    }

}
