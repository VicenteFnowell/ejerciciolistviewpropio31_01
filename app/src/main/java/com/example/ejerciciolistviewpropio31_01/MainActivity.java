package com.example.ejerciciolistviewpropio31_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvpersonajes;
    ArrayList<Personaje> lista_personajes = new ArrayList<Personaje>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();

        lvpersonajes=(ListView)findViewById(R.id.lv_personajes);
        AdaptadorPersonaje adaptador = new AdaptadorPersonaje(this,lista_personajes);
        lvpersonajes.setAdapter(adaptador);

        lvpersonajes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Personaje c = ((Personaje)parent.getItemAtPosition(position));
                String descripcion = c.getDescripcion();
                Toast.makeText(getApplicationContext(),descripcion,Toast.LENGTH_LONG).show();
            }
        });




    }//FIN ONCREATE

    private void cargarDatos(){

        lista_personajes.add(new Personaje("mickey", "Sean Astin","Mickey", "Líder del grupo de chicos, fanático de la hisoria"));
        lista_personajes.add(new Personaje("gordi", "Jeff Cohen","Gordi", "Su mote lo dice todo, quiere tocar el violín"));
        lista_personajes.add(new Personaje("bocazas", "Corey Feldman","Bocazas", "Nunca, nunca, nunca, nunca para de hablar"));
        lista_personajes.add(new Personaje("data", "Jonathan Ke Quan","Data", "Inventor de pacotilla, fan del agente 007"));
        lista_personajes.add(new Personaje("brad", "Josh Brolin","Brad", "Hermano mayor de Mickey, cuida de la pandilla"));
        lista_personajes.add(new Personaje("andy", "Kerri Green","Andy", "Animadora en apuros, está colada por Brad"));
        lista_personajes.add(new Personaje("stef", "Martha Plimpton","Stef", "Amiga de Andy, a menudo choca con Bocazas"));
        lista_personajes.add(new Personaje("sloth", "John Matuszak","Sloth", "Un monstruo con buen corazón, se hace muy amigo de Gordi"));
        lista_personajes.add(new Personaje("mama_fratelli", "Anne Ramsey","Mamá Fratelli", "Cabeza pensante de la banda de Los Fratelli"));
        lista_personajes.add(new Personaje("jake", "Robert Davi","Jake Fratelli", "Buen cocinero, mejor cantante de ópera, al fin y al cabo no es tan malo"));
        lista_personajes.add(new Personaje("francis", "Joe Pantoliano","Francis Fratelli", "Se ha comido la pizza de peperoni de su hermano y lleva peluquín"));

    }







}//FIN ACTIVITY
