package com.jsp.jsp.service;

import com.jsp.jsp.domain.model.Book;
import java.util.Collection;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  @Override
  public Collection<Book> getBooks() {
    return List.of(
        new Book("dsfdsa", "Livro 1", "Zezin da Capitinga"),
        new Book("dsfdsa", "Livro 1", "Zezin da Capitinga"),
        new Book("dsfdsa", "Livro 1", "Zezin da Capitinga"),
        new Book("dsfdsa", "Livro 1", "Zezin da Capitinga"));
  }

  @Override
  public Book addBook(Book book) {
    return new Book(book.getIsbn(), book.getName(), book.getAuthor());
  }
}
