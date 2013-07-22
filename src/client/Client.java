package client;

import domain.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;


/**
 * Created with IntelliJ IDEA.
 * User: ciprianosanchez
 * Date: 7/21/13
 * Time: 12:05 PM
 *
 * Harness client for the Book Store application
 *
 * @link
 */

public class Client
{
    public static void main(String[] args)
    {
        //Create the Spring container
        ApplicationContext container = new
        ClassPathXmlApplicationContext("spring-config.xml");

        //Create the bookService to process books
        BookService bookService = (BookService)
                container.getBean("bookService");
        //Create a new book
        Book newBook = new Book("1234", "Spring in Action",
                "Rod Johnson");

        //register a new book
        bookService.registerNewBook(newBook);
    }
}


