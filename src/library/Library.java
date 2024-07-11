package library;

import library.books.*;
import library.memberRecords.MemberRecord;

import java.util.*;
import java.util.stream.Collectors;

public class Library {

    public Map<String, Integer> bookMap = new TreeMap<>();
    private List<Book> bookList = new ArrayList<>();
    private Set<Book> enumeratedBookSet = new LinkedHashSet<>();

    private List<MemberRecord> personList = new LinkedList<>();

    public Library(){
        Book  book1 = new Magazine(1L,"testMagazineAuthor0","testMagazine0",10.0,true,"1st", "11.07.2024");
        Book  book2 = new Magazine(3L,"testMagazineAuthor1","testMagazine1",10.0,true,"1st", "11.07.2024");
        Book  book3 = new Journal(3L,"","testJournal0",6.0,true,"1st", "11.07.2024");
        Book  book4 = new StudyBook(1L,"testMath0","testMath0",10.0,true,"1st", "11.07.2024");
        Book  book5 = new StudyBook(1L,"testScience","testScience0",12.0,true,"1st", "11.07.2024");
        Book  book6 = new StudyBook(1L,"testSpanish","testSpanish0",20.0,true,"2st", "11.07.2024");
        Book  book7 = new Noval(1L,"testNovalAuthor0","testNoval0",12.0,true,"3rd", "11.07.2024");
        Book  book8 = new Noval(1L,"testNovalAuthor1","testNoval2",10.0,true,"1st", "11.07.2024");
        Book  book9 = new Journal(1L,"testJournalAuthor0","testMagazine0",10.0,true,"1st", "11.07.2024");
        Book  book10 = new Magazine(2L,"testMagazineAuthor3","testMagazine3",10.0,true,"1st", "11.07.2024");


        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);

        stockChecker();
    }

    public Map<String, Integer> stockChecker(){
        for (Book book : bookList){
            bookMap.put(book.getTitle(), 0);
        }
        for (Book book : bookList){
            if (bookMap.containsKey(book.getTitle())){
                bookMap.put(book.getTitle(), bookMap.get(book.getTitle()) + 1);
            }
        }
        return bookMap;
    }

    public List<MemberRecord> getPersonList(){
        return personList;
    }

    public void setPersonList(List<MemberRecord> personList){
        this.personList = personList;
    }


    public void addPersonToLibrary(MemberRecord person) {
        personList.add(person);
    }

    public void setBookMap(Map<String, Integer> bookMap) {
        this.bookMap = bookMap;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }


    public Map<String, Integer> getBookMap() {
        return bookMap;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Book searchByBookId(int id) {
        for (Book book : bookList) {
            if (book.getBookId() == id) {
                return book;
            }
        }
        System.out.println("Please enter a valid Book Id");
        return null;
    }


    public Book searchByBookName(String title) {
        for (Book book : bookList) {
            if (Objects.equals(book.getTitle(), title)) {
                return book;
            }
        }
        System.out.println("Please enter a valid Book name");
        return null;
    }

    public Book searchByBookAuthor(String author) {
        for (Book book : bookList) {
            if (Objects.equals(book.getAuthor(), author)) {
                return book;
            }
        }
        System.out.println("Please enter a valid author");
        return null;
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void editBook(Book oldBook, Book newBook){
        for (Book book : bookList){
            if (book.equals(oldBook)){
                book.setId(newBook.getBookId());
                book.setAuthor(newBook.getAuthor());
                book.setTitle(newBook.getTitle());
                book.setPrice(newBook.getPrice());
                book.setGenre(newBook.getGenre());
                book.setStatus(newBook.isStatus());
                book.setEdition(newBook.getEdition());
                book.setDateOfPurchase(newBook.getDateOfPurchase());
            }
        }
        System.out.println("Please enter a valid book");
    }

    public void removeBook(Book book){
        if (bookList.contains(book)){
            bookList.remove(book);
            if (bookMap.get(book.getTitle())>0){
                bookMap.put(book.getTitle(), bookMap.get(book.getTitle()) - 1);
            }
        } else {
            System.out.println("Selected book is not valid");
        }
    }

    public Set<Book> listAllByAuthors(String name) {
        Set<Book> categorizedBookSet = new HashSet<>();

        for (Book book : bookList) {
            if (book.getAuthor().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                categorizedBookSet.add(book);
            }
        }
        return categorizedBookSet;
    }

    public Set<Book> listAllByCategories(String categories) {
        Set<Book> categorizedBookSet = new HashSet<>();


        for (Book book : bookList) {
            if (book.getAuthor().toLowerCase(Locale.ROOT).contains(categories.toLowerCase(Locale.ROOT))) {
                categorizedBookSet.add(book);
            }
        }
        return categorizedBookSet;
    }


    public Set<Book> listAllByAStatus(boolean status) {

        Set<Book> categorizedBookSet = bookList.stream()
                .filter(book -> book.isStatus() == status)
                .collect(Collectors.toSet());
        return categorizedBookSet;
    }



}
