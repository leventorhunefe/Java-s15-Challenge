package library.person;

import library.books.Book;

public abstract class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public abstract String whoYouAre();

    public void donateBook(){

    }

    public void returnBook(){

    }

    public Book borrowBook(Book book){
        return book;
    }

    public void removeBook(Book book){

    }


}
