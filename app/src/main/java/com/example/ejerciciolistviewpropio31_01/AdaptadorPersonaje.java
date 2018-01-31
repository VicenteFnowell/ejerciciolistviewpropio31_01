package com.example.ejerciciolistviewpropio31_01;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vicente FN on 31/01/2018.
 */

public class AdaptadorPersonaje extends ArrayAdapter<Personaje> {


        ArrayList<Personaje> personajes;
        Context c;

    public AdaptadorPersonaje(Context c, ArrayList<Personaje> personajes){
        super(c,R.layout.item_personaje,personajes);
        this.c = c;
        this.personajes = personajes;

    }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_personaje,null);

        //TextView Nombre PERSONAJE
        TextView tv_nombre=(TextView)item.findViewById(R.id.tvnombre);
        tv_nombre.setText(personajes.get(position).getPersonaje());

        //TextView Nombre ACTOR
        TextView tv_actor=(TextView)item.findViewById(R.id.tvactor);
        tv_actor.setText(personajes.get(position).getActor());

            //TextView DESCRIPCION
            TextView tv_descripcion=(TextView)item.findViewById(R.id.tvdescripcion);
            tv_descripcion.setText(personajes.get(position).getDescripcion());

        //ImageView
        String logo = personajes.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(logo, "drawable", c.getPackageName());
        ImageView iv_logo = (ImageView)item.findViewById(R.id.Imagen);
        iv_logo.setImageResource(idImagen);


        return item;



    }
    }
