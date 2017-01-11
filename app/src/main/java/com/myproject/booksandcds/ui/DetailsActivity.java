package com.myproject.booksandcds.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.myproject.booksandcds.R;
import com.myproject.booksandcds.model.Product;
import com.myproject.booksandcds.model.books.Book;
import com.myproject.booksandcds.model.books.CookingBook;
import com.myproject.booksandcds.model.books.EsotericBook;
import com.myproject.booksandcds.model.books.ProgrammingBook;
import com.myproject.booksandcds.model.discs.Disc;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.myproject.booksandcds.R.array.subtype;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.details_linear_layout)
    LinearLayout detailsLinearLayout;

    LayoutInflater inflater;

    private String[] types;
    private String[] subTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        inflater = getLayoutInflater();

        types = getResources().getStringArray(R.array.type);
        subTypes = getResources().getStringArray(subtype);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bindDetails();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void bindDetails() {

        Product selectedProduct = (Product) getIntent().getExtras().getSerializable(ProductAdapter.SELECTED_PRODUCT_BUNDLE);

        addItem(getString(R.string.name_text_label), selectedProduct.getName());
        addItem(getString(R.string.type_text_label), types[selectedProduct.getType()]);
        addItem(getString(R.string.subtype_text_label), subTypes[selectedProduct.getSubType()]);
        addItem(getString(R.string.price_text_label), String.valueOf(selectedProduct.getPrice()));
        addItem(getString(R.string.barcode_text_label), selectedProduct.getBarCode());

        if (selectedProduct instanceof Book) {
            Book book = (Book) selectedProduct;
            addItem(getString(R.string.number_of_pages_text_label), String.valueOf(book.getNumberOfPages()));

            if (book instanceof CookingBook) {
                CookingBook cookingBook = (CookingBook) book;
                addItem(getString(R.string.main_ingredient_text_label), cookingBook.getMainIngredient());

            } else if (book instanceof ProgrammingBook) {
                ProgrammingBook programmingBook = (ProgrammingBook) book;
                addItem(getString(R.string.programming_language_text_label), programmingBook.getProgrammingLanguage());

            } else {
                EsotericBook esotericBook = (EsotericBook) book;
                addItem(getString(R.string.age_rating_text_label), String.valueOf(esotericBook.getAgeRating()));

            }

        } else {
            Disc disc = (Disc) selectedProduct;
            addItem(getString(R.string.type_of_content_text_label), disc.getContent());

        }

    }

    private void addItem(String fieldName, String text) {
        View view = inflater.inflate(R.layout.details_item, null, false);
        ((TextView) view.findViewById(R.id.details_item_text_view)).setText(getString(R.string.type_text_full_formatted, fieldName, text));
        detailsLinearLayout.addView(view);
    }

}
