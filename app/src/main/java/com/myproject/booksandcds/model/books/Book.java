package com.myproject.booksandcds.model.books;

import com.myproject.booksandcds.model.Product;

import java.math.BigDecimal;

public abstract class Book extends Product {

    static final Integer SUBTYPE_BOOK_PROGRAMMING = 0;
    static final Integer SUBTYPE_BOOK_COOKING = 1;
    static final Integer SUBTYPE_BOOK_ESOTERIC = 2;

    private Integer numberOfPages;

    Book(Integer type, Integer subType, String name, BigDecimal price, String barCode, Integer numberOfPages) {
        super(type, subType, name, price, barCode);
        this.numberOfPages = numberOfPages;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }
}
