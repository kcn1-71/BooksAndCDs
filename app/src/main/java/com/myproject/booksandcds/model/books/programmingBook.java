package com.myproject.booksandcds.model.books;

import com.myproject.booksandcds.model.Product;

import java.math.BigDecimal;

public class ProgrammingBook extends Book {
    private String programmingLanguage;

    public ProgrammingBook(String name, BigDecimal price, String barCode, Integer numberOfPages, String programmingLanguage) {
        super(Product.TYPE_BOOK, Book.SUBTYPE_BOOK_PROGRAMMING, name, price, barCode, numberOfPages);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
