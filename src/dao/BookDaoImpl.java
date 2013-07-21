package dao;

import domain.Book;

/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/21/13
 * Time: 12:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookDaoImpl implements BookDao
{
    //Following the program to an interface principle
    //we've created a new Interface BookService
    //with a registerNewBook method
    public void save(Book book)
    {
        System.out.println("Saving book: " + book);
    }
}
