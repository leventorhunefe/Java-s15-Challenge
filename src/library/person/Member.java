package library.person;

import java.util.List;

public class Member extends Person{

    private List<String> books;

    public Member(String name, List<String> books){
        super(name);
        this.books = books;
    }

    @Override
    public String whoYouAre() {
        String b;
        if (books.size() > 1) {
            b = "books";
        } else {
            b = "book";
        }
        return getName() + " borrowed " + books.size() + " " + b;
    }

    @Override
    public String toString() {
        return "Member{" +
                " name = '" + getName() + '\'' +
                ", books=" + books +
                '}';
    }

}
