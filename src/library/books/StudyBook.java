package library.books;

import library.enums.Course;

public class StudyBook extends Book {

    private Course course;

    public StudyBook(Long id, String author, String title, Double price, boolean status, String edition, String dateOfPurchase) {
        super(id, author, title, price, status, edition, dateOfPurchase);
    }
}


// It's completed

