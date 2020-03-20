package com.example.menuairtoday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import com.example.menuairtoday.XMLParser.XMLPullParserDatos;
import com.example.menuairtoday.javaBean.Dato;
import com.example.menuairtoday.retroUtils.APIService;
import com.example.menuairtoday.retroUtils.RetrofitClient;
import com.example.menuairtoday.rvUtils.DatosAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Aire extends AppCompatActivity {

    RecyclerView rv;
    LinearLayoutManager llm;
    DatosAdapter da;
    private TextView tvDatosTiempoReal;
    private WebView datosTiempoReal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aire);

        tvDatosTiempoReal = findViewById(R.id.tvDatosTiempoReal);

        datosTiempoReal = findViewById(R.id.datosTiempoReal);

        WebSettings webSettings = datosTiempoReal.getSettings();
        webSettings.getAllowContentAccess();
        webSettings.setJavaScriptEnabled(true);

        datosTiempoReal.loadUrl("https://datos.madrid.es/sites/v/index.jsp?vgnextoid=41e01e007c9db410VgnVCM2000000c205a0aRCRD&vgnextchannel=374512b9ace9f310VgnVCM100000171f5a0aRCRD");

        datosTiempoReal.setWebViewClient(new WebViewClient());
    }
}
