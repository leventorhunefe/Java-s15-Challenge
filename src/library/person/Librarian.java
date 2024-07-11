package library.person;

import library.books.Book;

import java.util.concurrent.atomic.AtomicInteger;

public class Librarian extends Person{
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String password;

    // Due to usage of AtomicInteger, there is no need to use id in constructor's parameters
    public Librarian(String name, String password) {
        super(name);
        this.id = count.incrementAndGet();
        this.password = password;
    }

    public int getId(){
        return id;
    }



    @Override
    public String whoYouAre() {
        return "Librarian: " + getName() + ", ID: " + id;
    }

    @Override
    public void removeBook(Book book) {
        super.removeBook(book);
    }
}
