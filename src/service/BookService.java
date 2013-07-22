package service;

import domain.Book;

/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/21/13
 * Time: 3:56 PM
 *
 * This interface represents the contract for all implementers of the {@link BookService} interface.
 *
  * @link
 */
public interface BookService
{
    /**
     * Register and process a new book in the system.
     * This is the service layer between our client and the db, this method
     * probably in real life will be performing some business logic before
     * persisting the book. i.e check if it already exists..
     * @param newBook The book to be registered.
     */
    void registerNewBook(Book newBook);
}


