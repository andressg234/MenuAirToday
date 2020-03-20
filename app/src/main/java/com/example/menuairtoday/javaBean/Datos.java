package com.example.menuairtoday.javaBean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Datos {

    @SerializedName("Datos")
    @Expose

    private ArrayList<Dato> datos = null;

    public ArrayList<Dato> getDatos() { return datos; }

    public void setMonuments(ArrayList<Dato> monuments) {
        this.datos = datos;
    }
}
