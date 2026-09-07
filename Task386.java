package java_9;

public class Task386 {
    public class FindMaximum {

        public static int findMax(int[] numbers, int index) {

            if (index == numbers.length - 1) {
                return numbers[index];
            }

            int maxOfRest = findMax(numbers, index + 1);

            if (numbers[index] > maxOfRest) {
                return numbers[index];
            }

            return maxOfRest;
        }

        public static void main(String[] args) {

            int[] numbers = {3, 7, 2, 9, 4};

            System.out.println(findMax(numbers, 0));
        }
    }
}
