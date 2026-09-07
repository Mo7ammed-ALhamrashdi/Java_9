package java_9;

public class Task396 {
    public class SumEvenIndexes {

        public static int sumEvenIndex(int[] numbers, int index) {

            if (index >= numbers.length) {
                return 0;
            }

            return numbers[index]
                    + sumEvenIndex(numbers, index + 2);
        }

        public static void main(String[] args) {

            int[] numbers = {10, 5, 20, 5, 30};

            System.out.println(sumEvenIndex(numbers, 0));
        }
    }
}
