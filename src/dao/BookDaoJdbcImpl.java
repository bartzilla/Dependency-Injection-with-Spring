package dao;

import domain.Book;

/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/23/13
 * Time: 7:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookDaoJdbcImpl implements BookDao
{
    public void save(Book book)
    {
        System.out.println("Saving book: " + book + " using the JDBC API");
    }
}
