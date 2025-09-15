package Homeworks;

public class Homework3 {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        // 1. Print all elements in one line separated by space
        System.out.print("All elements: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 2. Print first element
        System.out.println("First element: " + numbers[0]);

        // 3. Print last element
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // 4. Print array length
        System.out.println("Length of array: " + numbers.length);

        // 5. Print odd elements
        System.out.print("Odd elements: ");
        for (int n : numbers) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // 6. Print middle element(s)
        if (numbers.length % 2 == 1) {
            int mid = numbers.length / 2;
            System.out.println("Middle element: " + numbers[mid]);
        } else {
            int mid1 = numbers.length / 2 - 1;
            int mid2 = numbers.length / 2;
            System.out.println("Middle elements: " + numbers[mid1] + ", " + numbers[mid2]);
        }

        // 7. Count number of even elements
        int evenCount = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of even elements: " + evenCount);

        // 8. Count number of odd elements
        int oddCount = 0;
        for (int n : numbers) {
            if (n % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Count of odd elements: " + oddCount);

        // 9. Sum of elements
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum of all elements: " + sum);

        // 10. Average of elements
        double average = (double) sum / numbers.length;
        System.out.println("Average of elements: " + average);
    }

}
