package Homeworks;

public class Homework4 {
    public static void main(String[] args) {
        //exercise1
        int[] numbers = {3, 4, 16, 74, 9, 6, 2, 22, 11, 33 };
        int n = 6;
        int count = 0;
        for (int num : numbers) {
            if(num == n){
                count++;
            }
        }
        System.out.println("Count =" + count);

        //exercise2
        for (int i = 0; i < numbers.length- 1; i++) {
            for (int j = i +1; j < numbers.length ; j++) {
                if(numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] =numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Array sorted in descending order ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        //exercise3
        int duplicateCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) continue;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }

        System.out.println("Number of dublicate elements: " + duplicateCount);

        //exercise4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int result = 0;
        for (char c : chars) {
            switch (c) {
                case 'ա': case 'ե': case 'է': case 'ը':
                case 'ի': case 'ո': case 'օ': case 'և':
                    result = result + 1;
            }
        }

        System.out.println("Number of vowels: " + result);
    }
}
