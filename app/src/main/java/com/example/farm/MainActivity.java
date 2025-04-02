package com.example.farm;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.farm.models.Alimento;
import com.example.farm.models.Estoque;
import com.example.farm.models.Vacina;

public class MainActivity extends AppCompatActivity {
    private Estoque estoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        estoque = new Estoque();

        estoque.adicionarProduto(new Alimento("Milho", 100, "10/09/2025"));
        estoque.adicionarProduto(new Vacina("Vacina contra febre aftosa", 50, "30/09/2024"));

        TextView textViewResumo = findViewById(R.id.textViewResumo);
        textViewResumo.setText("Produtos Adicionados em Estoque!");
    }
}