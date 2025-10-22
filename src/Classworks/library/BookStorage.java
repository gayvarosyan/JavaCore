package Classworks.library;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public int getSize(){
        return size;
    }

    public void add(Book book) {
        if (size == books.length){
            extend();
        }
       books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books,0,tmp,0,size);
        books = tmp;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public void deleteBookById(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--size] = null;
                System.out.println("Book deleted!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with id " + id + " not found");
        }
    }

    public void searchByPriceRange(double min, double max) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            double price = books[i].getPrice();
            if (price >= min && price <= max) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found in price range " + min + " - " + max);
        }
    }



    public Book getBookByMaxPrice() {

        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
       return books[maxIndex];
    }
}
