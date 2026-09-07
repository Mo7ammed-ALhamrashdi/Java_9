package java_9;

public class Task391 {
    public class CheckArraySorted {

        public static boolean isSorted(int[] numbers, int index) {

            if (index >= numbers.length - 1) {
                return true;
            }

            if (numbers[index] > numbers[index + 1]) {
                return false;
            }

            return isSorted(numbers, index + 1);
        }

        public static void main(String[] args) {

            int[] numbers = {1, 2, 3, 4};

            System.out.println(isSorted(numbers, 0));
        }
    }
}
