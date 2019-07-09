package com.company.MariaSanchezU1M5Summative.dao;

import com.company.MariaSanchezU1M5Summative.model.Author;
import com.company.MariaSanchezU1M5Summative.model.Book;
import com.company.MariaSanchezU1M5Summative.model.Publisher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookDaoTest {

    @Autowired
    protected AuthorDao authorDao;
    @Autowired
    protected BookDao bookDao;
    @Autowired
    protected PublisherDao publisherDao;

    @Before
    public void setUp() throws Exception {
        // Clean out the test db
        List<Book> bookList = bookDao.getAllBooks();
        bookList.stream()
                .forEach(book -> bookDao.deleteBook(book.getId()));

        List<Publisher> publisherList = publisherDao.getAllPublishers();
        publisherList.stream()
                .forEach(publisher -> publisherDao.deletePublisher(publisher.getId()));

        List<Author> authorList = authorDao.getAllAuthors();
        authorList.stream()
                .forEach(author -> authorDao.deleteAuthor(author.getId()));

    }

    @Test
    public void addGetDeleteBook() {

        // Create a publisher and author first with set property values and add them to a list
        Author author = new Author();
        author.setFirstName("Paulo");
        author.setLastName("Coelho");
        author.setStreet("Broad Street");
        author.setCity("Cool City");
        author.setState("NJ");
        author.setPostalCode("12345");
        author.setPhone("973-555-1234");
        author.setEmail("pcoelho@email.com");
        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("Harper Publishers");
        publisher.setStreet("57th Street");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setPostalCode("10022");
        publisher.setPhone("212-555-1234");
        publisher.setEmail("hpublishers@email.com");
        publisher = publisherDao.addPublisher(publisher);

        // Then create a book, add it to a list
        Book book = new Book();
        book.setIsbn("9780061122415");
        book.setPublishDate(LocalDate.of(1993, 05, 25));
        book.setAuthorId(author.getId());
        book.setTitle("The Alchemist");
        book.setPublisherId(publisher.getId());
        book.setPrice(new BigDecimal("13.95"));
        book = bookDao.addBook(book);

        // Create a new book instance equal to the book you just created
        Book book1 = bookDao.getBook(book.getId());

        // Compare the two instances
        assertEquals(book1, book);

        // Then delete and make sure it was deleted
        bookDao.deleteBook(book.getId());

        book1 = bookDao.getBook(book.getId());

        assertNull(book1);
    }

    @Test(expected  = DataIntegrityViolationException.class)
    public void addWithRefIntegrityException() {

        Book book = new Book();
        book.setIsbn("9780061122415");
        book.setPublishDate(LocalDate.of(1993, 05, 25));
        book.setAuthorId(27);
        book.setTitle("The Alchemist");
        book.setPublisherId(30);
        book.setPrice(new BigDecimal("13.95"));
        book = bookDao.addBook(book);
    }

    @Test
    public void getAllBooks() {

        // Create a publisher and author first with set property values and add them to a list
        Publisher publisher = new Publisher();
        publisher.setName("Harper Publishers");
        publisher.setStreet("57th Street");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setPostalCode("10022");
        publisher.setPhone("212-555-1234");
        publisher.setEmail("hpublishers@email.com");
        publisher = publisherDao.addPublisher(publisher);

        Author author = new Author();
        author.setFirstName("Paulo");
        author.setLastName("Coelho");
        author.setStreet("Broad Street");
        author.setCity("Cool City");
        author.setState("NJ");
        author.setPostalCode("12345");
        author.setPhone("973-555-1234");
        author.setEmail("pcoelho@email.com");
        author = authorDao.addAuthor(author);

        // Then create some books and add them to a list
        Book book = new Book();
        book.setIsbn("9780061122415");
        book.setPublishDate(LocalDate.of(1993, 05, 27));
        book.setAuthorId(author.getId());
        book.setTitle("The Alchemist");
        book.setPublisherId(publisher.getId());
        book.setPrice(new BigDecimal("13.95"));
        book = bookDao.addBook(book);

        book = new Book();
        book.setIsbn("9780061133123");
        book.setPublishDate(LocalDate.of(2008, 05, 25));
        book.setAuthorId(author.getId());
        book.setTitle("Eleven Minutes");
        book.setPublisherId(publisher.getId());
        book.setPrice(new BigDecimal("15.95"));
        book = bookDao.addBook(book);

        book = new Book();
        book.setIsbn("9780061144122");
        book.setPublishDate(LocalDate.of(2002, 03, 30));
        book.setAuthorId(author.getId());
        book.setTitle("Warrior of the Light");
        book.setPublisherId(publisher.getId());
        book.setPrice(new BigDecimal("14.95"));
        book = bookDao.addBook(book);

        List<Book> bookList = bookDao.getAllBooks();

        // Compare the size of the bookList to the number of books added
        assertEquals(bookList.size(), 3);
    }

    @Test
    public void getBooksByAuthor() {

        // Create publishers and authors first with set property values and add them to a list
        Publisher publisher1 = new Publisher();
        publisher1.setName("Harper Publishers");
        publisher1.setStreet("57th Street");
        publisher1.setCity("New York");
        publisher1.setState("NY");
        publisher1.setPostalCode("10022");
        publisher1.setPhone("212-555-1234");
        publisher1.setEmail("hpublishers@email.com");
        publisher1 = publisherDao.addPublisher(publisher1);

        Publisher publisher2 = new Publisher();
        publisher2.setName("Rivers Publishers");
        publisher2.setStreet("50th Street");
        publisher2.setCity("New York");
        publisher2.setState("NY");
        publisher2.setPostalCode("10022");
        publisher2.setPhone("212-555-1111");
        publisher2.setEmail("rpublishers@email.com");
        publisherDao.addPublisher(publisher2);

        Author author1 = new Author();
        author1.setFirstName("Paulo");
        author1.setLastName("Coelho");
        author1.setStreet("Broad Street");
        author1.setCity("Cool City");
        author1.setState("NJ");
        author1.setPostalCode("12345");
        author1.setPhone("973-555-1234");
        author1.setEmail("pcoelho@email.com");
        author1 = authorDao.addAuthor(author1);

        Author author2 = new Author();
        author2.setFirstName("Elizabeth");
        author2.setLastName("Gilbert");
        author2.setStreet("Main Street");
        author2.setCity("Cool City");
        author2.setState("NJ");
        author2.setPostalCode("12345");
        author2.setPhone("973-555-1111");
        author2.setEmail("egilbert@email.com");
        author2 = authorDao.addAuthor(author2);

        // Create some books and add them to the list with the associated authors and publishers
        Book book = new Book();
        book.setIsbn("9780061122415");
        book.setPublishDate(LocalDate.of(1993, 05, 27));
        book.setAuthorId(author1.getId());
        book.setTitle("The Alchemist");
        book.setPublisherId(publisher1.getId());
        book.setPrice(new BigDecimal("13.95"));
        book = bookDao.addBook(book);

        book = new Book();
        book.setIsbn("9780061133123");
        book.setPublishDate(LocalDate.of(2008, 05, 25));
        book.setAuthorId(author1.getId());
        book.setTitle("Eleven Minutes");
        book.setPublisherId(publisher1.getId());
        book.setPrice(new BigDecimal("15.95"));
        book = bookDao.addBook(book);

        book = new Book();
        book.setIsbn("9780061144122");
        book.setPublishDate(LocalDate.of(2002, 03, 30));
        book.setAuthorId(author1.getId());
        book.setTitle("Warrior of the Light");
        book.setPublisherId(publisher1.getId());
        book.setPrice(new BigDecimal("14.95"));
        book = bookDao.addBook(book);

        book = new Book();
        book.setIsbn("977006112345");
        book.setPublishDate(LocalDate.of(2002, 04, 10));
        book.setAuthorId(author2.getId());
        book.setTitle("Eat, Pray, Love");
        book.setPublisherId(publisher2.getId());
        book.setPrice(new BigDecimal("12.95"));
        book = bookDao.addBook(book);

        // Get list of books by author1 which should be 3 books total
        List<Book> bookList = bookDao.getBooksByAuthor(author1.getId());
        assertEquals(bookList.size(), 3);

        // Get list of books by author2 which should be 1 book total
        bookList = bookDao.getBooksByAuthor(author2.getId());
        assertEquals(bookList.size(), 1);
    }

    @Test
    public void updateBook() {

        // Create a publisher and author first with set property values and add them to a list
        Author author = new Author();
        author.setFirstName("Paulo");
        author.setLastName("Coelho");
        author.setStreet("Broad Street");
        author.setCity("Cool City");
        author.setState("NJ");
        author.setPostalCode("12345");
        author.setPhone("973-555-1234");
        author.setEmail("pcoelho@email.com");
        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("Harper Publishers");
        publisher.setStreet("57th Street");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setPostalCode("10022");
        publisher.setPhone("212-555-1234");
        publisher.setEmail("hpublishers@email.com");
        publisher = publisherDao.addPublisher(publisher);

        // Then create a book, add it to a list
        Book book = new Book();
        book.setIsbn("9780061122415");
        book.setPublishDate(LocalDate.of(1993, 05, 27));
        book.setAuthorId(author.getId());
        book.setTitle("The Alchemist");
        book.setPublisherId(publisher.getId());
        book.setPrice(new BigDecimal("13.95"));
        book = bookDao.addBook(book);

        // Then update that object with some new values
        book.setTitle("Updated title: ALCHEMIST");
        book.setPublishDate(LocalDate.of(1998, 04, 27));
        book.setPrice(new BigDecimal("12.95"));
        bookDao.updateBook(book);

        // Create a new book instance equal to the book you just updated
        Book book1 = bookDao.getBook(book.getId());

        // Compare the two instances
        assertEquals(book1, book);
    }
}