package library.person;

import java.util.Set;

public class Author extends Person{
    private Set<String> books;

    public Author(Set<String> books, String name){
        super(name);
        this.books = books;
    }

    public void setBooks(Set<String> books) {
        this.books = books;
    }
    public Set<String> showBook(){
        return books;
    }
    public void newBook(String newBook){
        books.add(newBook);
    }

    @Override
    public String whoYouAre() {
        String b;
        if (books.size() > 1) {
            b = "books";
        } else {
            b = "book";
        }
        return getName() + " the Author of " + books.size() + " " + b;
    }

    @Override
    public String toString() {
        return "Author{" +
                "books=" + books +
                '}';
    }
}
