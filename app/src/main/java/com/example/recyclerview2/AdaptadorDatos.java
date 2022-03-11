package com.example.recyclerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//Hacemos un extends a la clase recyclerView.Adapter y llamamos a la clase que creamos donde están los
//datos en este caso Adapatadordatos.ViewHolder
//ternemos que crear el viewHolder para llenar los elementos de la vista con click derecho sobre el nombre de la clase
public class AdaptadorDatos extends RecyclerView.Adapter<AdaptadorDatos.ViewHolderDatos> {

    ArrayList<Items> listDatos;
    Context context;
//debemos crear el constructor
    public AdaptadorDatos(ArrayList<Items> listDatos, Context context) {
        this.listDatos = listDatos;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //debemos crear una vista y en vez de retornar null retornar la vista
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recycler,null,false);
        return new ViewHolderDatos(view);//retornamos un nuevo viewholder pero con la vista en su interior
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        //invocamos a holder y le decimos la posición y qu es lo que debe obtener
        //creamos los tres metodos accesadores para onbind
        holder.texto.setText(listDatos.get(position).getTexto());
        holder.des.setText(listDatos.get(position).getDes());
        holder.imagen.setImageResource(listDatos.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        //Creamos los objetos
        ImageView imagen;
        TextView texto;
        TextView des;

        //ponemos el mouse encima para crear el constructor
        //e invocamos a los elementos
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            imagen=itemView.findViewById(R.id.myImagen);
            texto=itemView.findViewById(R.id.myDato);
            des=itemView.findViewById(R.id.myDes);
        //A continuación declaramos arriba un arraylist

        }
    }
}
