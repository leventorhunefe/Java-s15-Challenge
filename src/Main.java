import library.Library;
import library.books.*;
import library.enums.MemberType;
import library.memberRecords.*;
import library.memberRecords.PhoneNumber;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*
        // Varsayılan US numarası ile öğrenci kaydı oluşturma
        StudentRecord defaultStudent = new StudentRecord();
        defaultStudent.setMemberId(123);
        defaultStudent.setType(MemberType.STUDENT);
        defaultStudent.setDateOfMembership("2023-01-01");
        defaultStudent.setMemberName("John Doe");
        defaultStudent.setMemberAddress("123 Main St, Anytown, USA");
        System.out.println(defaultStudent);
        defaultStudent.printMemberDetails();
        defaultStudent.returnBookMessage();

        // Kullanıcı tarafından sağlanan telefon numarası ile öğrenci kaydı oluşturma
        PhoneNumber customPhoneNumber = new PhoneNumber("+44-20-7946-0958");
        StudentRecord customStudent = new StudentRecord(456, MemberType.STUDENT, "2023-02-01",
                "Jane Smith", "456 Elm St, Othertown, UK", customPhoneNumber);
        System.out.println(customStudent);
        customStudent.printMemberDetails();
        customStudent.returnBookMessage();
    }
         */


        PhoneNumber phoneNumber = new PhoneNumber("+1-555-1234567");

        StudentRecord efe = new StudentRecord(1, MemberType.STUDENT, "2024-03-01", "Efe", "NY", phoneNumber);
        System.out.println(efe);

        // Library instance oluşturulması
        Library library = new Library();

        // Kitap eklemek
        Book newBook = new StudyBook(20L, "New Author", "New Book", 15.0, true, "1st", "11.07.2024");
        library.addBook(newBook);

        // Kitapları listelemek
        System.out.println("All Books:");
        for (Book book : library.getBookList()) {
            System.out.println(book);
        }

        // Kitap aramak
        int bookIdToSearch = 3;
        Book foundBookById = library.searchByBookId(bookIdToSearch);
        if (foundBookById != null) {
            System.out.println("Found Book by ID: " + foundBookById);
        }

        String bookNameToSearch = "testMagazine1";
        Book foundBookByName = library.searchByBookName(bookNameToSearch);
        if (foundBookByName != null) {
            System.out.println("Found Book by Name: " + foundBookByName);
        }

        String bookAuthorToSearch = "testMagazineAuthor0";
        Book foundBookByAuthor = library.searchByBookAuthor(bookAuthorToSearch);
        if (foundBookByAuthor != null) {
            System.out.println("Found Book by Author: " + foundBookByAuthor);
        }

        // Kategoriye göre kitapları listelemek
        String categoryToSearch = "math";
        Set<Book> booksByCategory = library.listAllByCategories(categoryToSearch);
        System.out.println("Books in Category '" + categoryToSearch + "':");
        for (Book book : booksByCategory) {
            System.out.println(book);
        }

        // Yazar adına göre kitapları listelemek
        String authorToSearch = "testNovalAuthor1";
        Set<Book> booksByAuthor = library.listAllByAuthors(authorToSearch);
        System.out.println("Books by Author '" + authorToSearch + "':");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }

        // Duruma göre kitapları listelemek
        boolean statusToSearch = true;
        Set<Book> booksByStatus = library.listAllByAStatus(statusToSearch);
        System.out.println("Books with Status '" + statusToSearch + "':");
        for (Book book : booksByStatus) {
            System.out.println(book);
        }

        // Kullanıcı ekleme ve listeleme
        MemberRecord member1 = new MemberRecord(1, MemberType.STUDENT, "2023-01-01", "Alice Smith", "123 Elm St", new PhoneNumber("+1-123-4567890")) {
            @Override
            public void returnBookMessage() {

            }

            @Override
            public void printMemberDetails() {

            }
        };
        MemberRecord member2 = new MemberRecord(2, MemberType.FACULTY, "2023-01-01", "Bob Johnson", "456 Oak St", new PhoneNumber("+1-234-5678901")) {

            @Override
            public void returnBookMessage() {

            }

            @Override
            public void printMemberDetails() {

            }
        };
        library.addPersonToLibrary(member1);
        library.addPersonToLibrary(member2);

        System.out.println("All Members:");
        for (MemberRecord member : library.getPersonList()) {
            System.out.println(member);
        }

        // Diğer işlemler buraya eklenebilir...
    }
}

