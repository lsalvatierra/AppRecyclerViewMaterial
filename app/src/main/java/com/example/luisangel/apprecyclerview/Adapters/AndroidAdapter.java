package com.example.luisangel.apprecyclerview.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luisangel.apprecyclerview.Modelos.Android;
import com.example.luisangel.apprecyclerview.R;
import com.example.luisangel.apprecyclerview.android_detalle;

import java.util.ArrayList;

public class AndroidAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Android> lista;

    public AndroidAdapter(Context context) {
        this.context = context;
        lista = new ArrayList<>();
    }


    class AndroidViewHolder extends RecyclerView.ViewHolder{
        ImageView ivImage;
        TextView tvNombre, tvVersion;
        CardView contenedor;
        public AndroidViewHolder(View itemView){
            super(itemView);
            ivImage = (ImageView) itemView.findViewById(R.id.ivImagen);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
            tvVersion = (TextView) itemView.findViewById(R.id.tvApellido);
            contenedor = (CardView) itemView.findViewById(R.id.contenedor);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(context)
                .inflate(R.layout.item_android, parent, false);
        return new AndroidViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        AndroidViewHolder viewHolder = (AndroidViewHolder) holder;
        final Android item = lista.get(position);
        viewHolder.ivImage.setImageResource(item.getImagen());
        viewHolder.tvNombre.setText(item.getNombre());
        viewHolder.tvVersion.setText(item.getVersion());
        viewHolder.contenedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intAndroidDetalle = new Intent(context, android_detalle.class);
                intAndroidDetalle.putExtra("android", item);
                context.startActivity(intAndroidDetalle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public void agregarElemento(ArrayList<Android> data){
        lista.clear();
        lista.addAll(data);
        notifyDataSetChanged();
    }
}
