package com.jsp.jsp.controller;

import com.jsp.jsp.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("/viewBooks")
  public String getBooks(Model model) {
    model.addAttribute("books", bookService.getBooks());
    return "view-books";
  }
}
