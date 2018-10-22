package com.example.luisangel.apprecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luisangel.apprecyclerview.Modelos.Android;

public class android_detalle extends AppCompatActivity {

    private TextView tvNombre, tvVersion;
    private ImageView ivAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_detalle);
        tvNombre = findViewById(R.id.tvNombreAndroid);
        tvVersion = findViewById(R.id.tvVersionAndroid);
        ivAndroid = findViewById(R.id.ivImagenAndroid);


        if(getIntent().hasExtra("android")){
            Android objAndroid = getIntent().getParcelableExtra("android");


            tvNombre.setText(Html.fromHtml("<b>Android:</b> :" + objAndroid.getNombre()));
            tvVersion.setText(Html.fromHtml("<b>Version:</b> :" + objAndroid.getVersion()));
            ivAndroid.setImageResource(objAndroid.getImagen());
        }
    }
}
