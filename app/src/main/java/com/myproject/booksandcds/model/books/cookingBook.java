package com.myproject.booksandcds.model.books;

import com.myproject.booksandcds.model.Product;

import java.math.BigDecimal;

public class CookingBook extends Book {

    private String mainIngredient;

    public CookingBook(String name, BigDecimal price, String barCode, Integer numberOfPages, String mainIngredient) {
        super(Product.TYPE_BOOK, Book.SUBTYPE_BOOK_COOKING, name, price, barCode, numberOfPages);
        this.mainIngredient = mainIngredient;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }
}
