package dao;

import domain.Book;

/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/21/13
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BookDao
{
    void save(Book newBook);
}
