package service;

import dao.BookDaoImpl;
import dao.BookDao;
import domain.Book;

/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/21/13
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookServiceImpl implements BookService
{
    private BookDao bookDao;

    public void registerNewBook(Book newBook)
    {
        bookDao.save(newBook);
    }

    public void setBookDao(BookDao bookDao)
    {
        this.bookDao = bookDao;
    }
}
