package Homeworks;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        int [] array = {4,7,1,3,9,0,2};
        Arrays.sort(array);
        for(int num: array) {
            System.out.print(num + " ");
        }
    }
}
