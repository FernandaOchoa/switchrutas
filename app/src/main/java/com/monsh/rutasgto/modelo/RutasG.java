package com.monsh.rutasgto.modelo;

import com.monsh.rutasgto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by monsh on 02/12/2015.
 */
public class RutasG {
    private String titulo;
    private String nombre;
    private int idDrawable;

    public RutasG(String titulo, String nombre, int idDrawable) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.idDrawable = idDrawable;

    }
    public static final List<RutasG> Rutas = new ArrayList<RutasG>();
    public static final List<RutasG> Sugeridas = new ArrayList<>();
    public static final List<RutasG> Premium = new ArrayList<>();
    public static final List<RutasG> Descanso = new ArrayList<>();

    static {


        Rutas.add(new RutasG("De la Independencia", "", R.drawable.doloresnoche));
        Rutas.add(new RutasG("Gastronomica", "", R.drawable.gastronomia));
        Rutas.add(new RutasG("Antros y Bares", "", R.drawable.cantina));
        Rutas.add(new RutasG("Extrema", "", R.drawable.deportesextremos));
        Rutas.add(new RutasG("Bodas", "", R.drawable.boda));

        Descanso.add(new RutasG("Museos", "Descubre la Historia", R.drawable.museo));
        Descanso.add(new RutasG("Negocios", "El lugar perfecto", R.drawable.lacasonanegocio));
        Descanso.add(new RutasG("Tequila", "Viva Mexico", R.drawable.tequila));
        Descanso.add(new RutasG("Salud", "En caso de Emergencia", R.drawable.emergencia));
        Descanso.add(new RutasG("Arqueologica", "El origen de todo", R.drawable.arquelogico));
        Descanso.add(new RutasG("Vino y la Uva", "Para paladares exigentes", R.drawable.vinouva));

        Sugeridas.add(new RutasG("Tacos", "Los mejores tacos", R.drawable.tacos));
        Sugeridas.add(new RutasG("Artesanal", "Un pedacito hecho a mano", R.drawable.laton));
        Sugeridas.add(new RutasG("Gastronomica", "Los lugares mas locos", R.drawable.costillas));
        Sugeridas.add(new RutasG("Selfies", "Los panoramas mas increibles", R.drawable.gtonocheb));
        Sugeridas.add(new RutasG("Cantinas", "Donde la fiesta nunca se acaba", R.drawable.tequila));
        Sugeridas.add(new RutasG("Cervantino", "Tradicion que se vive", R.drawable.gtonochec));

        Premium.add(new RutasG("Hoteles", "", R.drawable.descansol));
        Premium.add(new RutasG("Spa", "", R.drawable.spa));
        Premium.add(new RutasG("Restaurantes de Lujo", "", R.drawable.restaurantlujo));
        Premium.add(new RutasG("Golf", "", R.drawable.golfn));
        Premium.add(new RutasG("Tenis", "", R.drawable.tenis));
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }



}
