package com.company.MariaSanchezU1M5Summative.dao;

import com.company.MariaSanchezU1M5Summative.model.Author;
import com.company.MariaSanchezU1M5Summative.model.Book;
import com.company.MariaSanchezU1M5Summative.model.Publisher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AuthorDaoTest {

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

        List<Author> authorList = authorDao.getAllAuthors();
        authorList.stream()
                .forEach(author -> authorDao.deleteAuthor(author.getId()));

        List<Publisher> publisherList = publisherDao.getAllPublishers();
        publisherList.stream()
                .forEach(publisher -> publisherDao.deletePublisher(publisher.getId()));
    }

    @Test
    public void addGetDeleteAuthor() {

        // Create a new author object and set the values for its properties
        Author author = new Author();
        author.setFirstName("Paulo");
        author.setLastName("Coelho");
        author.setStreet("Broad Street");
        author.setCity("Cool City");
        author.setState("NJ");
        author.setPostalCode("12345");
        author.setPhone("973-555-1234");
        author.setEmail("pcoelho@email.com");

        // Add the author
        author = authorDao.addAuthor(author);

        // Create a new author instance equal to the author you just created
        Author author2 = authorDao.getAuthor(author.getId());

        // Compare the two instances
        assertEquals(author2, author);

        // Then delete and make sure it was deleted
        authorDao.deleteAuthor(author.getId());

        author2 = authorDao.getAuthor(author.getId());

        assertNull(author2);
    }

    @Test
    public void getAllAuthors() {

        // Create two new author objects with set values for properties and add them to a list
        Author author = new Author();
        author.setFirstName("Paulo");
        author.setLastName("Coelho");
        author.setStreet("Broad Street");
        author.setCity("Cool City");
        author.setState("NJ");
        author.setPostalCode("12345");
        author.setPhone("973-555-1234");
        author.setEmail("pcoelho@email.com");
        authorDao.addAuthor(author);

        author = new Author();
        author.setFirstName("Elizabeth");
        author.setLastName("Gilbert");
        author.setStreet("Main Street");
        author.setCity("Cool City");
        author.setState("NJ");
        author.setPostalCode("12345");
        author.setPhone("973-555-1111");
        author.setEmail("egilbert@email.com");
        authorDao.addAuthor(author);

        List<Author> authorList = authorDao.getAllAuthors();

        // Compare the size of the authorList to the number of authors added
        assertEquals(authorList.size(), 2);
    }

    @Test
    public void updateAuthor() {

        // Create an author object with set values for properties and add it
        Author author = new Author();
        author.setFirstName("Paulo");
        author.setLastName("Coelho");
        author.setStreet("Broad Street");
        author.setCity("Cool City");
        author.setState("NJ");
        author.setPostalCode("12345");
        author.setPhone("973-555-1234");
        author.setEmail("pcoelho@email.com");
        authorDao.addAuthor(author);

        // Then update that object with some new values
        author.setFirstName("Updated first name: PAULO");
        author.setCity("Updated city");
        authorDao.updateAuthor(author);

        // Create a new author instance equal to the author you just updated
        Author author1 = authorDao.getAuthor(author.getId());

        // Compare the two instances
        assertEquals(author1, author);
    }
}