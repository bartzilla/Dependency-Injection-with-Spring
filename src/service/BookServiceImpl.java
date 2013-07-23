package service;

import dao.BookDao;
import domain.Book;

/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/21/13
 * Time: 12:07 PM
 *
 * This class represents a contract implementation of {@link BookService} interface.
 * Feel free to implement your own business objects if you require to do so.
 *
 * @link
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
