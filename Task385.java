package java_9;

public class Task385 {
    public class SumArray {

        public static int sumArray(int[] numbers, int index) {

            if (index == numbers.length) {
                return 0;
            }

            return numbers[index] + sumArray(numbers, index + 1);
        }

        public static void main(String[] args) {

            int[] numbers = {1, 2, 3};

            System.out.println(sumArray(numbers, 0));
        }
    }
}
