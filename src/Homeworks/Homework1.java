package Homeworks;

public class Homework1 {
    public static void main(String[] args) {
        // exercise 1
        int x = 10;
        int y = 7;
        if (x > y) {
            System.out.println(x + " is bigger than " + y);
        } else if (x < y) {
            System.out.println(y + " is bigger than " + x);
        } else {
            System.out.println(x + " is equal to " + y);
        }

        //exercise 2
        for (int i = 1; i < 6; i++) {
            System.out.print(i + ", ");
        }

        //exercise 3
        int a = 5;
        int b = 7;
        int sum = a + b;
        System.out.print("sum of a and b is: " + sum);

        //exercise 4
        int n = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.print(n + " * " + i + " = " + (n * i));
        }
    }
}
