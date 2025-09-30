package Classworks;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();

        System.out.println("Welcome " + name + " " + surname);
    }
}
