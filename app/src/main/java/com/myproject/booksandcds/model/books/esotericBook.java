package com.myproject.booksandcds.model.books;

import com.myproject.booksandcds.model.Product;

import java.math.BigDecimal;

public class EsotericBook extends Book {
    private Integer ageRating;

    public EsotericBook(String name, BigDecimal price, String barCode, Integer numberOfPages, Integer ageRating) {
        super(Product.TYPE_BOOK, Book.SUBTYPE_BOOK_ESOTERIC, name, price, barCode, numberOfPages);
        this.ageRating = ageRating;
    }

    public Integer getAgeRating() {
        return ageRating;
    }
}
