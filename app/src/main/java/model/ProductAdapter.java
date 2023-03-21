package model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.productregister.R;

import java.util.ArrayList;
import  com.example.productregister.databinding.ProductItemBinding;
public class ProductAdapter extends BaseAdapter {

    private ProductItemBinding binding;

    private ArrayList<Product> products;
    private Context context;

    public ProductAdapter(ArrayList<Product> products, Context context) {
        this.products = products;
        this.context = context;

    }


    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.product_item, null);
        }

        Product product = products.get(i);
        /* binding.nameTV.setText(product.name);

        binding.priceTV.setText(String.format("Mzn %.2f", product.price));

        binding.quantityTV.setText("Quantidade: " + product.quantity);

        binding.validateTV.setText("Validade: " + product.validate);*/
        TextView nomeProduto = view.findViewById(R.id.nameTV);
        nomeProduto.setText(product.name);

        TextView precoProduto = view.findViewById(R.id.priceTV);
        precoProduto.setText(String.format("Mzn %.2f", product.price));

        TextView quantidadeProduto = view.findViewById(R.id.quantityTV);
        quantidadeProduto.setText("Quantidade: " + product.quantity);

        TextView validadeProduto = view.findViewById(R.id.quantityTV);
        validadeProduto.setText("validade: " + product.validate);

        return view;
    }
}
