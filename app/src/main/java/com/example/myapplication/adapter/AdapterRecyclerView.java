package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.models.DataPublications;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>{


    private ArrayList<DataPublications> publicacion;
    private Context mContext;

    public AdapterRecyclerView(ArrayList<DataPublications> publicacion, Context mContext) {
        this.publicacion = publicacion;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.publicationshome, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.dim(publicacion.get(position));
    }

    @Override
    public int getItemCount() {
        return publicacion.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView nameUser, publicacionUser, detailsDesperfecto ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameUser = itemView.findViewById(R.id.namePublication);
            publicacionUser = itemView.findViewById(R.id.detailsPublication);
            detailsDesperfecto = itemView.findViewById(R.id.detailsDesperfecto);
        }

        public void dim (DataPublications publicacion){
            this.nameUser.setText(publicacion.getNamepublication());
            this.publicacionUser.setText(publicacion.getDescriptpublication());
            this.detailsDesperfecto.setText(publicacion.getDesperfectopublication());
        }


    }
}
