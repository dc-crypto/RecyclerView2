package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Cargamos los elementos en memoria
    ArrayList<Personaje> listDatos = new ArrayList<>();
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
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
        listDatos.add(new Personaje(R.drawable.celulares,"Celulares","Un teléfono móvil o teléfono celular es un dispositivo portátil que puede hacer o recibir llamadas a través de una portadora de radiofrecuencia, mientras el usuario se está moviendo "));
//a continuacioón debemos invocar a la clase adaptador datos
        AdaptadorDatos adaptadorDatos=new AdaptadorDatos(listDatos,this);
        myRecyclerView.setAdapter(adaptadorDatos);
    }
}