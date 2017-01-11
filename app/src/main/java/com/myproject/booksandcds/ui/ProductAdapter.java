package com.myproject.booksandcds.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myproject.booksandcds.R;
import com.myproject.booksandcds.model.Product;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.myproject.booksandcds.R.array.subtype;

class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    static final String SELECTED_PRODUCT_BUNDLE = "ProductAdapter.selectedProductBundle";
    private List<Product> products;
    private Context context;

    private String[] types;
    private String[] subTypes;

    ProductAdapter(Context context, List<Product> products) {
        this.products = products;
        this.context = context;

        types = context.getResources().getStringArray(R.array.type);
        subTypes = context.getResources().getStringArray(subtype);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return new ViewHolder(inflater.inflate(R.layout.recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        Product product = products.get(position);

        String type = types[product.getType()];
        String subtype = subTypes[product.getSubType()];

        holder.name.setText(product.getName());
        holder.type.setText(context.getResources().getString(R.string.type_text_full_formatted, type, subtype));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startDetailsActivity = new Intent(context, DetailsActivity.class);
                startDetailsActivity.putExtra(SELECTED_PRODUCT_BUNDLE, products.get(holder.getAdapterPosition()));
                context.startActivity(startDetailsActivity);
            }
        });

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    void addAll(List<Product> products) {
        this.products.addAll(products);
        Collections.sort(this.products);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.list_item_name_textview)
        TextView name;

        @BindView(R.id.list_item_type_textview)
        TextView type;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
