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
public class PublisherDaoTest {

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
    public void addGetDeletePublisher() {

        // Create a new publisher object and set the values for its properties
        Publisher publisher = new Publisher();
        publisher.setName("Harper Publishers");
        publisher.setStreet("57th Street");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setPostalCode("10022");
        publisher.setPhone("212-555-1234");
        publisher.setEmail("hpublishers@email.com");

        // Add the publisher
        publisher = publisherDao.addPublisher(publisher);

        // Create a new publisher instance equal to the publisher you just created
        Publisher publisher1 = publisherDao.getPublisher(publisher.getId());

        // Compare the two instances
        assertEquals(publisher1, publisher);

        // Then delete and make sure it was deleted
        publisherDao.deletePublisher(publisher.getId());

        publisher1 = publisherDao.getPublisher(publisher.getId());

        assertNull(publisher1);
    }


    @Test
    public void getAllPublishers() {

        // Create two new publisher objects with set values for properties and add them to a list
        Publisher publisher = new Publisher();
        publisher.setName("Harper Publishers");
        publisher.setStreet("57th Street");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setPostalCode("10022");
        publisher.setPhone("212-555-1234");
        publisher.setEmail("hpublishers@email.com");
        publisherDao.addPublisher(publisher);

        publisher = new Publisher();
        publisher.setName("Rivers Publishers");
        publisher.setStreet("50th Street");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setPostalCode("10022");
        publisher.setPhone("212-555-1111");
        publisher.setEmail("rpublishers@email.com");
        publisherDao.addPublisher(publisher);

        List<Publisher> publisherList = publisherDao.getAllPublishers();

        // Compare the size of the publisherList to the number of publishers added
        assertEquals(publisherList.size(), 2);
    }

    @Test
    public void updatePublisher() {

        // Create a publisher object with set values for properties and add it
        Publisher publisher = new Publisher();
        publisher.setName("Harper Publishers");
        publisher.setStreet("57th Street");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setPostalCode("10022");
        publisher.setPhone("212-555-1234");
        publisher.setEmail("hpublishers@email.com");
        publisherDao.addPublisher(publisher);

        // Then update that object with some new values
        publisher.setName("Updated publisher name");
        publisher.setCity("Updated City");
        publisher.setPostalCode("10001");
        publisherDao.updatePublisher(publisher);

        // Create a new publisher instance equal to the publisher you just updated
        Publisher publisher1 = publisherDao.getPublisher(publisher.getId());

        // Compare the two instances
        assertEquals(publisher1, publisher);
    }
}