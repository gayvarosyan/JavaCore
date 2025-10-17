package Classworks.library;

import java.util.Scanner;

public class LibraryDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD BOOK");
            System.out.println("Please input 2 for PRINT ALL BOOKS");
            System.out.println("Please input 3 for SEARCH BOOK BY TITLE");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input books title");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Please input books auther");
                    String authorName = scanner.nextLine();
                    System.out.println("Please input books prince");
                    double price = Double.parseDouble(scanner.nextLine());
                    Book Book = new Book(bookTitle, authorName, price);
                    bookStorage.add(Book);
                    System.out.println("Book added successfully");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
            }

        }
    }
}
