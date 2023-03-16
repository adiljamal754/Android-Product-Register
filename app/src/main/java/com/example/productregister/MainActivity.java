package com.example.productregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    }

    public void addProduct(View view){

        String name = binding.nameTxt.getText().toString();
        double price = Double.parseDouble(binding.priceTxt.getText().toString());
        int qnt = Integer.parseInt(binding.quantityTxt.getText().toString());
        String date = binding.dateTxt.getText().toString();

        Product p = new Product(name, price, qnt, date);
        products.add(p);

        Toast.makeText(this, "Produto Gravado", Toast.LENGTH_SHORT).show();

        binding.nameTxt.setText(" ");
        binding.priceTxt.setText(" ");
        binding.quantityTxt.setText(" ");
        binding.dateTxt.setText(" ");
    }

    public void showProducts(View view){

        for (Product prod: products
             ) {
            System.out.println("\n================");
            System.out.println("Nome: " + prod.name);
            System.out.println("Preço: " + prod.price);
            System.out.println("Quantidae: " + prod.quantity);
            System.out.println("Data de Validade: " + prod.validate);
        }

    }
}