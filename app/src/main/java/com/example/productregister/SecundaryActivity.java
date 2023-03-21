package com.example.productregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.productregister.databinding.ActivitySecundaryBinding;

import java.util.ArrayList;

import model.Product;
import model.ProductAdapter;

public class SecundaryActivity extends AppCompatActivity {

    private ActivitySecundaryBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecundaryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = getIntent().getExtras();
        ArrayList<Product> products = (ArrayList<Product>) bundle.getSerializable("productsList");

        ProductAdapter adapter = new ProductAdapter(products, this);

        binding.productLV.setAdapter(adapter);

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}