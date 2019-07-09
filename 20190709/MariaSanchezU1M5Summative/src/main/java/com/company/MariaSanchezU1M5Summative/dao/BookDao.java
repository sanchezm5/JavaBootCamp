package com.company.MariaSanchezU1M5Summative.dao;

import com.company.MariaSanchezU1M5Summative.model.Book;
import java.util.List;

public interface BookDao {

    Book addBook(Book book);

    Book getBook(int id);

    List<Book> getAllBooks();

    List<Book> getBooksByAuthor(int authorId);

    void updateBook(Book book);

    void deleteBook(int id);

}
