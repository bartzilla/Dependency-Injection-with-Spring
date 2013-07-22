package dao;

import domain.Book;

/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/21/13
 * Time: 12:09 PM
 *
 * This class represents a contract implementations of the {@link BookDao} interface.
 * If you want to create your own implementation of BookDao
 * i.e BookDaoJdbcImpl, BookDaoHibernateImpl feel free to do so.
 *
 * @link
 */
public class BookDaoImpl implements BookDao
{
    public void save(Book book)
    {
        System.out.println("Saving book: " + book);
    }
}
