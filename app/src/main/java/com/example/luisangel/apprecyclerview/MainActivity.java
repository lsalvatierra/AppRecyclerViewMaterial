package com.example.luisangel.apprecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.luisangel.apprecyclerview.Adapters.AndroidAdapter;
import com.example.luisangel.apprecyclerview.Modelos.Android;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView rvDatos;
    private AndroidAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvDatos = (RecyclerView)findViewById(R.id.rvDatos);
        rvDatos.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        adapter = new AndroidAdapter(MainActivity.this);
        rvDatos.setAdapter(adapter);
        ArrayList<Android> lista = new ArrayList<>();

        lista.add(new Android(
                lista.size()+1,
                R.drawable.image1,
                "Angel cake",
                "Android 1.0"
        ));
        lista.add(new Android(
                lista.size()+1,
                R.drawable.image2,
                "Battenberg",
                "Android 1.1"
        ));

        lista.add(new Android(
                lista.size()+1,
                R.drawable.image3,
                "Cupcake",
                "Android 1.5"
        ));
        lista.add(new Android(
                lista.size()+1,
                R.drawable.image4,
                "Donut",
                "Android 1.6"
        ));
        lista.add(new Android(
                lista.size()+1,
                R.drawable.image5,
                "Eclair",
                "Android 1.0"
        ));
        lista.add(new Android(
                lista.size()+1,
                R.drawable.image6,
                "Froyo",
                "Android 1.1"
        ));

        lista.add(new Android(
                lista.size()+1,
                R.drawable.image7,
                "Cupcake",
                "Android 1.5"
        ));
        lista.add(new Android(
                lista.size()+1,
                R.drawable.image8,
                "Gingerbread",
                "Android 1.6"
        ));
        adapter.agregarElemento(lista);

    }
}
