package java_9;

public class Task394 {
    public class CountZeros {

        public static int countZeros(int number) {

            if (number < 10) {

                if (number == 0) {
                    return 1;
                }

                return 0;
            }

            int count = 0;

            if (number % 10 == 0) {
                count = 1;
            }

            return count + countZeros(number / 10);
        }

        public static void main(String[] args) {

            System.out.println(countZeros(1020));
            System.out.println(countZeros(5000));
            System.out.println(countZeros(123));
            System.out.println(countZeros(908070));
        }
    }
}
