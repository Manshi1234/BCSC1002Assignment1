/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;


public class Library {
    private Book[] booksCurrentlyAvailable;

    //created the constructor
    public Library() {
        this.booksCurrentlyAvailable = new Book[20];
//        for (int i = 0; i < Book.length(); i++) {
//
//        }
        this.booksCurrentlyAvailable[0] = new Book("Discrete mathematics", "Kneath rosan", "2765931054782");
        this.booksCurrentlyAvailable[1] = new Book("Oops", "Dusty phillips", "4376589120763");
        this.booksCurrentlyAvailable[2] = new Book("Python", "Harsh bhasin", "8623498640274");
    }

    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable.clone();
    }

    public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }


}