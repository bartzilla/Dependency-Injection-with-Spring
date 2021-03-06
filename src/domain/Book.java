package domain;

/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/21/13
 * Time: 12:10 PM
 *
 * This class represents the Book domain model. Real life domain models
 * normally will include getters and setters to access the object's fields
 *
 * @link
 */
public class Book
{
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String toString()
    {
        return this.title + " by " + this.author;
    }
}
