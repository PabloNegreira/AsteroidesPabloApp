package com.example.dam223.asteroidespabloapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void lanzarAcercaDe(View view){
        Intent i = new Intent(this, acercaDeActivity.class);
        startActivity(i);
    }
    public void terminarAplicacion(View view) {
        finish();
    }
    @Override public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true; /** true -> el menú ya está visible */
        }
        @Override public boolean onOptionsItemSelected(MenuItem item) {
        boolean correcto=true;
            int id = item.getItemId();
            switch(id){
                case R.id.acercaDe:
                    lanzarAcercaDe(null);
                    break;
                default:
                    Toast mensa = Toast.makeText(this, "Pablo Rodríguez Negreira: Opción en construccion",
                    Toast.LENGTH_SHORT);
                    mensa.show();
                    break;
            }
           // correcto=super.onOptionsItemSelected(item);
            return super.onOptionsItemSelected(item);
        }
}

