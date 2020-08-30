/*  Created by IntelliJ IDEA.
 *  User: Priyanshu Rajput
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class Book {
    private String nameOfBook;
    private String nameOfTheAuthor;
    private String ISBN;
    int priceOfBook;
    String colorOfBook;
    Scanner scanner = new Scanner(System.in);
    public Book() {

    }
    public Book(int priceOfBook, String colorOfBook) {
        this.priceOfBook = priceOfBook;
        this.colorOfBook = colorOfBook;
    }
    public Book(String bookName, String authorName, String isbn) {
        this.nameOfBook = bookName;
        this.nameOfTheAuthor = authorName;
        this.ISBN = isbn;
    }
}


