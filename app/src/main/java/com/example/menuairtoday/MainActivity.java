package com.example.menuairtoday;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    MenuItem itmMapa;
    private WebView miWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itmMapa = findViewById(R.id.itmIconMapa);

        miWebView = findViewById(R.id.datosTiempoReal);

        WebSettings webSettings = miWebView.getSettings();
        webSettings.getAllowContentAccess();
        webSettings.setJavaScriptEnabled(true);

        miWebView.loadUrl("https://datos.madrid.es/sites/v/index.jsp?vgnextoid=41e01e007c9db410VgnVCM2000000c205a0aRCRD&vgnextchannel=374512b9ace9f310VgnVCM100000171f5a0aRCRD");

        miWebView.setWebViewClient(new WebViewClient());

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.itmIconAire) {

            Intent i = new Intent(this,Aire.class);
            startActivity(i);



        } else if(item.getItemId() == R.id.itmIconMapa) {


            Intent i = new Intent(this, Mapa.class);
            startActivity(i);


        } else if(item.getItemId() == R.id.itmIconAire) {



        } else if(item.getItemId() == R.id.itmIconCalendario) {



        } else if(item.getItemId() == R.id.itmIconChat) {

            Intent i = new Intent(this, Chat.class);
            startActivity(i);

        } else if(item.getItemId() == R.id.itmIconBuscar) {



        } else if(item.getItemId() == R.id.itmIconPerfil) {

            Intent i = new Intent(this, Perfil.class);
            startActivity(i);

        }


        return super.onOptionsItemSelected(item);
    }

}
