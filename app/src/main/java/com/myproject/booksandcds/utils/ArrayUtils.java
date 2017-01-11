package com.myproject.booksandcds.utils;

import com.myproject.booksandcds.model.Product;
import com.myproject.booksandcds.model.books.CookingBook;
import com.myproject.booksandcds.model.books.EsotericBook;
import com.myproject.booksandcds.model.books.ProgrammingBook;
import com.myproject.booksandcds.model.discs.CD;
import com.myproject.booksandcds.model.discs.DVD;
import com.myproject.booksandcds.model.discs.Disc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayUtils {

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new CookingBook("CookingBook1", new BigDecimal(100), "barCode1", 250, "mainIngredient1"));
        products.add(new CookingBook("CookingBook2", new BigDecimal(150), "barCode2", 270, "mainIngredient2"));
        products.add(new CookingBook("CookingBook3", new BigDecimal(200), "barCode3", 700, "mainIngredient3"));
        products.add(new CookingBook("CookingBook4", new BigDecimal(170), "barCode4", 600, "mainIngredient4"));
        products.add(new CookingBook("CookingBook5", new BigDecimal(180), "barCode5", 120, "mainIngredient5"));
        products.add(new CookingBook("CookingBook6", new BigDecimal(1000), "barCode6", 300, "mainIngredient6"));

        products.add(new EsotericBook("EsotericBook1", new BigDecimal(20), "barCode7", 40, 16));
        products.add(new EsotericBook("EsotericBook2", new BigDecimal(45), "barCode8", 60, 18));
        products.add(new EsotericBook("EsotericBook3", new BigDecimal(30), "barCode9", 50, 18));
        products.add(new EsotericBook("EsotericBook4", new BigDecimal(110), "barCode10", 100, 16));
        products.add(new EsotericBook("EsotericBook5", new BigDecimal(90), "barCode11", 400, 14));
        products.add(new EsotericBook("EsotericBook6", new BigDecimal(99), "barCode12", 350, 16));

        products.add(new ProgrammingBook("ProgrammingBook1", new BigDecimal(100), "barCode13", 400, "Python"));
        products.add(new ProgrammingBook("ProgrammingBook2", new BigDecimal(120), "barCode14", 450, "Ruby"));
        products.add(new ProgrammingBook("ProgrammingBook3", new BigDecimal(150), "barCode15", 450, "Java"));
        products.add(new ProgrammingBook("ProgrammingBook4", new BigDecimal(100), "barCode16", 600, "JavaScript"));
        products.add(new ProgrammingBook("ProgrammingBook5", new BigDecimal(200), "barCode17", 1500, "C++"));
        products.add(new ProgrammingBook("ProgrammingBook6", new BigDecimal(220), "barCode18", 700, "C#"));

        products.add(new CD("CD1", new BigDecimal(100), "barCode19", Disc.CONTENT_VIDEO));
        products.add(new CD("CD2", new BigDecimal(110), "barCode20", Disc.CONTENT_VIDEO));
        products.add(new CD("CD3", new BigDecimal(90), "barCode21", Disc.CONTENT_MUSIC));
        products.add(new CD("CD4", new BigDecimal(95), "barCode22", Disc.CONTENT_MUSIC));
        products.add(new CD("CD5", new BigDecimal(105), "barCode23", Disc.CONTENT_SOFTWARE));
        products.add(new CD("CD6", new BigDecimal(100), "barCode24", Disc.CONTENT_SOFTWARE));

        products.add(new DVD("DVD1", new BigDecimal(100), "barCode25", Disc.CONTENT_VIDEO));
        products.add(new DVD("DVD2", new BigDecimal(110), "barCode26", Disc.CONTENT_VIDEO));
        products.add(new DVD("DVD3", new BigDecimal(90), "barCode27", Disc.CONTENT_MUSIC));
        products.add(new DVD("DVD4", new BigDecimal(95), "barCode28", Disc.CONTENT_MUSIC));
        products.add(new DVD("DVD5", new BigDecimal(105), "barCode29", Disc.CONTENT_SOFTWARE));
        products.add(new DVD("DVD6", new BigDecimal(100), "barCode30", Disc.CONTENT_SOFTWARE));

        long seed = System.nanoTime();
        Collections.shuffle(products, new Random(seed));
    }

    public static List<Product> getProducts() {
        return products;
    }

}
