package Classworks;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input numbers. (ex 1, 2, 3,)");

        String numbersStr = scanner.nextLine();
        String[] numbersArrStr = numbersStr.split(",");
        int[] numbers = new int[numbersArrStr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersArrStr[i]);
        }



//        System.out.println("Please input Length of array");
//        int length = Integer.parseInt(scanner.nextLine());
//        int[] array = new int[length];
//        System.out.println("Please input" + length + " numbers");
//        for (int i = 0; i < length; i++) {
//            String numberStr = scanner.nextLine();
//            int number = Integer.parseInt(numberStr);
//            array[i] = number;
//        }
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] > max){
//                max = array[i];
//            }
//        }
//        System.out.println("max = " + max);


//        String a = "54.8";
//        double d = Double.parseDouble(a);
//        System.out.println(d);


//        String a = "77";
//        int[] array = new int[5];
//        int n = Integer.parseInt(a);
//        array[0] = n;
//
//        for (int i : array) {
//            System.out.print(i + " ");
    }
}
//}
