package com.example.menuairtoday.retroUtils;

import com.example.menuairtoday.javaBean.Dato;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    public static final String BASE_URL = "http://10.0.0.1:3000";

    /*@GET("horario.xml")
    Call<Datos> obtenerDatos();*/

    @GET("datos")
    Call<ArrayList<Dato>> obtenerDatos();
}
