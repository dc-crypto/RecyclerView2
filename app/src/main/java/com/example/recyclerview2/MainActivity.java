package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Cargamos los elementos en memoria
    ArrayList<Items> listDatos = new ArrayList<>();
    RecyclerView myRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView=findViewById(R.id.myRecyclerView);
        //a continuación debemos definir las cactaeristicas del layout del recyclerview
        //va a ser un                       linear                                          vertical y          no hace loop
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //a continuación llenamos el array
        listDatos.add(new Items(R.drawable.alarma,"Alarma","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
        listDatos.add(new Items(R.drawable.aspiradora,"Aspiradora","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
        listDatos.add(new Items(R.drawable.auriculares,"Auriculares","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
        listDatos.add(new Items(R.drawable.camara,"Cámara","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
        listDatos.add(new Items(R.drawable.notebook,"Notebook","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
        listDatos.add(new Items(R.drawable.parlante,"Parlante","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
        listDatos.add(new Items(R.drawable.roku,"Roku","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
        listDatos.add(new Items(R.drawable.taladro,"Taladro","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
        listDatos.add(new Items(R.drawable.termo,"Termo","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
        listDatos.add(new Items(R.drawable.parlante2,"Parlante Mix","La Garantía extendida es un servicio ofrecido por los vendedores que busca prolongar el tiempo de cobertura de la garantía que tiene un producto."));
//a continuacioón debemos invocar a la clase adaptador datos
        AdaptadorDatos adaptadorDatos=new AdaptadorDatos(listDatos,this);
        myRecyclerView.setAdapter(adaptadorDatos);
    }
}