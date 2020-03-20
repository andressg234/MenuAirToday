package com.example.menuairtoday.rvUtils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.menuairtoday.R;
import com.example.menuairtoday.javaBean.Dato;

import java.util.ArrayList;

public class DatosAdapter extends RecyclerView.Adapter<DatosAdapter.DatoVH>
        implements View.OnClickListener {

    ArrayList<Dato> lista;
    View.OnClickListener listener;

    public DatosAdapter(ArrayList<Dato> lista) {this.lista = lista;}

    @NonNull
    @Override
    public DatoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_datos, parent, false);
        v.setOnClickListener(listener);
        return new DatoVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DatoVH holder, int position) {
        holder.bindMonument(lista.get(position));
    }


    @Override
    public int getItemCount() { return lista.size();}

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onClick(v);
        }
    }

    public  class DatoVH extends RecyclerView.ViewHolder{
        TextView tvDatosTiempoReal;

        public DatoVH(@NonNull View v) {
            super(v);
            tvDatosTiempoReal = v.findViewById(R.id.tvDatosTiempoReal);
        }

        public void bindMonument(Dato dato){
            tvDatosTiempoReal.setText(dato.getAno());
        }


    }
    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }
}
