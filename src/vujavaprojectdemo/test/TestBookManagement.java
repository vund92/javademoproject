package vujavaprojectdemo.test;

import vujavaprojectdemo.io.DataFactory;
import vujavaprojectdemo.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBookManagement {

    static List<Book> books = new ArrayList<>();
    static String bookDB = "E:\\books.txt";

    public static void bookMenu() {
        System.out.println("Please select an Option:");
        System.out.println("\t1. Add a new book");
        System.out.println("\t2. Find a book base on ISBN");
        System.out.println("\t3. Find Books from an Author");
        System.out.println("\t4. Exit program");

        int inputOption;
        Scanner scanner = new Scanner(System.in);
        inputOption = scanner.nextInt();

        switch (inputOption) {
            case 1:
                addNewBook();
                break;
            case 2:
                findBook();
                break;
            case 3:
                findBooksFromAuthor();
                break;
            case 4:
                System.exit(4);
                break;
            default:
                System.out.println("That option is invalid!");
                break;
        }
    }

    private static void findBooksFromAuthor() {
        List<Book> bookListFromAuthor = new ArrayList<>();

        // Get Books from the file
        List<Book> books = DataFactory.readBookList(bookDB);

        System.out.println("Please enter the author name:");
        Scanner scanner = new Scanner(System.in);
        String authorName = scanner.nextLine();

        for (Book book_ : books) {
            if(book_.getAuthorName().equals(authorName)) {
                bookListFromAuthor.add(book_);
            }
        }

        if (bookListFromAuthor.isEmpty()){
            System.out.println("There is no books for the author: " + authorName);
            return;
        }

        for (Book authorBook : bookListFromAuthor) {
            System.out.println(authorBook);
        }

    }

    private static void addNewBook() {
        System.out.println("Please enter Book name:");
        Scanner scanner = new Scanner(System.in);

        String bookTitle = scanner.nextLine();

        System.out.println("Please enter Book author:");
        String bookAuthor = scanner.nextLine();

        System.out.println("Please enter Book ISBN:");
        int ISBN = scanner.nextInt();

        System.out.println("Please enter Book year:");
        int bookYear = scanner.nextInt();

        Book book = new Book(bookTitle, ISBN, bookAuthor, bookYear);
        books.add(book);

        DataFactory.saveBookList(books, bookDB);
    }

    private static Book findBook() {
        Book book = new Book();

        // Get Books from the file
        List<Book> books = DataFactory.readBookList(bookDB);

        // Query the Book base on the book list
        System.out.println("Please enter Book ISBN:");

        Scanner scanner = new Scanner(System.in);
        int ISBN = scanner.nextInt();

        for(Book book_ : books){
            if(book_.getISBN() == ISBN) book = book_;
        }

        if(book.getTitle() == null)
            System.out.println("The book is not found");
        else
            System.out.println(book);
        return book;
    }

    public static void main(String[] args) {
        // This infinitive loop is terminated by one of options from menu
        while(true) {
            bookMenu();
        }
    }
}