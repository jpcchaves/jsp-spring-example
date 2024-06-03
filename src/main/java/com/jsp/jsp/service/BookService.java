package com.jsp.jsp.service;

import com.jsp.jsp.domain.model.Book;
import java.util.Collection;

public interface BookService {
  Collection<Book> getBooks();

  Book addBook(Book book);
}
