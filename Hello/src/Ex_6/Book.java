package Ex_6;
public class Book{
    private String title;
    private String author;
    private static int numCopies = 0;
    private static int numLendCopies = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        numCopies++;
    }

    public boolean loanBook() {
        if (numCopies > 0) {
            numCopies--;
            numLendCopies++;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (numLendCopies > 0) {
            numLendCopies--;
            numCopies++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", copies= " + numCopies +
                ", lend copies= " + numLendCopies +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public int getNumLendCopies() {
        return numLendCopies;
    }
}



/*
1) Create a class called Book that stores the information for each of the books in a library.
The class should keep the title of the book, author, number of copies of the book and number of lend copies.

The class will contain the following methods:
Default constructor. Constructor with parameters. Setters / getters.

Method Loan that increases the corresponding attribute each time a loan is made from the book.
No books may be borrowed if no copies are available to lend.
Returns true if the operation was successful and false otherwise.

Returns method that decrements the corresponding attribute when a book is returned.
No books can be returned that have not been lend.
Returns true if the operation was successful and false otherwise.

ToString method to display data from books.
This method is inherited from Object and we must modify it (override) to adapt it to the Book class.
Write a program to test the operation of the Book class.
 */
