package Homeworks;


public class Homework5 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 16, 74, 9, 6, 2, 22, 11, 33};

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.println("Array sorted in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

