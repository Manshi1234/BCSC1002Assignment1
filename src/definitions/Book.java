/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfBooks;
    private String nameOfAuthors;
    // since it Should be a of 13 Digits
    private String isbnNumberOfBooks;

    public Book() {
        this.nameOfBooks = "PHYSICS";
        this.nameOfAuthors = "S.L.ARORA";
        this.isbnNumberOfBooks = "4657893425097";
    }

    public Book(String nameOfBooks, String nameOfAuthors, String isbnNumberOfBooks) {
        this.nameOfBooks = nameOfBooks;
        this.nameOfAuthors = nameOfAuthors;
        this.isbnNumberOfBooks = isbnNumberOfBooks;
    }
}


