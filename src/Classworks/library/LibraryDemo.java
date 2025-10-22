package Classworks.library;

import java.util.Scanner;

public class LibraryDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_ALL_BOOKS = "2";
    private static final String SEARCH_BOOK_BY_TITLE = "3";
    private static final String PRINT_EXPENSIVE_BOOK = "4";
    private static final String DELETE_BOOK_BY_ID = "5";
    private static final String SEARCH_BY_PRICE_RANGE = "6";


    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;

                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    System.out.println(bookStorage.getBookByMaxPrice());
                    break;
                case DELETE_BOOK_BY_ID:
                    if (bookStorage.getSize() == 0) {
                        System.out.println("there is no book");
                    } else {
                        bookStorage.print();
                        System.out.println("Choose book for delete");
                        String id = scanner.nextLine();
                        bookStorage.deleteBookById(id);
                    }
                    break;
                case SEARCH_BY_PRICE_RANGE:
                    System.out.println("Please input min price:");
                    double min = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input max price:");
                    double max = Double.parseDouble(scanner.nextLine());
                    bookStorage.searchByPriceRange(min, max);
                    break;

                default:
                    System.err.println("Wrong command! try again");
            }

        }
    }

    private static void addBook() {
        System.out.println("Please input book id:");
        String id = scanner.nextLine();

        System.out.println("Please input book title:");
        String title = scanner.nextLine();

        System.out.println("Please input author name:");
        String authorName = scanner.nextLine();

        System.out.println("Please input book price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input book quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());

        Book book = new Book(id, title, authorName, price, quantity);
        bookStorage.add(book);
        System.out.println("Book added successfully!");
    }


    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT ALL BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE + " for SEARCH BOOK BY TITLE");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " for PRINT EXPENSIVE BOOK");
        System.out.println("Please input " + DELETE_BOOK_BY_ID + " for DELETE BOOK");
        System.out.println("Please input " + SEARCH_BY_PRICE_RANGE + " for SEARCH BOOKS BY PRICE RANGE");
    }
}

