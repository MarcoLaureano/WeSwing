package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.weswing.adapter.AdapterPublicacion;
import com.example.weswing.entity.ItemPublicacion;

import java.util.ArrayList;
import java.util.List;

public class Inici extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterPublicacion adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inici);

        recyclerView = findViewById(R.id.publicacions);

        List<ItemPublicacion> listaPublicaciones = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ItemPublicacion publicacion = new ItemPublicacion("Natalia Quintana", "Bailara en la plaza del pueblo!", "Hace 12 horas");
            listaPublicaciones.add(publicacion);
        }

        adaptador = new AdapterPublicacion(listaPublicaciones);
        recyclerView.setAdapter(adaptador);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}