package Classworks;

public class Sort {
    public static void main(String[] args) {
        int[] numbers ={4, 5, 8, 1,};
        for (int i = 0; i < numbers.length -1; i++) {
            int minIndex = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex= j;
                }
            }
            int temp= numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        System.out.println("Array sorted in ascending order:");
        for (int num : numbers){
            System.out.print(num +" ");
        }
    }
}
