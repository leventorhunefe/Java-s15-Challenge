package library.books;

public class Magazine extends Book{
    public Magazine(Long id, String author, String title, Double price, boolean status, String edition, String dateOfPurchase) {
        super(id, author, title, price, status, edition, dateOfPurchase);
    }


    @Override
    public String toString() {
        return "Magazine{ " +
                "Magazine ID = " + getBookId() +
                ", " + "Author = '" + getAuthor() +
                "title = '"+ getTitle() +
                ", price = " + getPrice() +
                "' }";
    }
}
