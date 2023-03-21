package com.example.productregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import model.Product;

import com.example.productregister.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


        ArrayList<Product> products = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = binding.nameTxt.getText().toString().trim();
                        double price = Double.parseDouble(binding.priceTxt.getText().toString().trim());
                        int qnt = Integer.parseInt(binding.quantityTxt.getText().toString().trim());
                        String date = binding.dateTxt.getText().toString().trim();

                        Product p = new Product(name, price, qnt, date);
                        products.add(p);

                        binding.nameTxt.setText(" ");
                        binding.priceTxt.setText(" ");
                        binding.quantityTxt.setText(" ");
                        binding.dateTxt.setText(" ");
                    }
                }
        );

        binding.btnShow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Bundle bundle = new Bundle();
                        bundle.putSerializable("productsList", products);

                        Intent intent = new Intent(MainActivity.this,  SecundaryActivity.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                }
        );
    }


 /*   public void showProducts(View view){

        for (Product prod: products
             ) {
            System.out.println("\n================");
            System.out.println("Nome: " + prod.name);
            System.out.println("Preço: " + prod.price);
            System.out.println("Quantidae: " + prod.quantity);
            System.out.println("Data de Validade: " + prod.validate);
        }

    }*/
}