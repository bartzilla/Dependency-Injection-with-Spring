package dao;

import domain.Book;

/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/21/13
 *
 * This interface represents a contract DAO for all different persistence strategies
 * to process {@link Book}s.
 *
 * @link
 */
public interface BookDao
{
    /**
     * Save the given book in the database.
     * @param newBook The book to be saved in the database.
     */
    void save(Book newBook);
}
