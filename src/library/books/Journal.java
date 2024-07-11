package library.books;

public class Journal extends Book {
    public Journal(Long id, String author, String title, Double price, boolean status, String edition, String dateOfPurchase) {
        super(id, author, title, price, status, edition, dateOfPurchase);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "Journal ID = " +
                getBookId() + ", "
                + "Author = ' "
                + getAuthor() + "' }";
    }
}
