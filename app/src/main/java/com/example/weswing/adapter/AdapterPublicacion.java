package com.example.weswing.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswing.R;
import com.example.weswing.entity.ItemPublicacion;
import java.util.List;

public class AdapterPublicacion extends RecyclerView.Adapter<AdapterPublicacion.ViewHolder> {
    private List<ItemPublicacion> listaPublicaciones;

    public AdapterPublicacion(List<ItemPublicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_publicacions, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemPublicacion publicacion = listaPublicaciones.get(position);

        holder.nombreUsuarioTextView.setText(publicacion.getNombreUsuario());
        holder.contenidoTextView.setText(publicacion.getContenido());
        holder.horarioTextView.setText(publicacion.getHorario());
    }

    @Override
    public int getItemCount() {
        return listaPublicaciones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombreUsuarioTextView;
        TextView contenidoTextView;
        TextView horarioTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreUsuarioTextView = itemView.findViewById(R.id.NombreUsuario);
            contenidoTextView = itemView.findViewById(R.id.contenido);
            horarioTextView = itemView.findViewById(R.id.horario);
        }
    }
}

