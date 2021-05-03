package com.pacheco.segundoparcialmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Contenido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
    }

    public void showJeanSelect(View view) {
        displayToast("Jean Sibelius");
    }
    public void showLeosSelect(View view) {
        displayToast("Leos Janacek");
    }
    public void showAnnaSelect(View view) {
        displayToast("Anna Porvaldsdottir");
    }
    public void showFredericSelect(View view) {
        displayToast("Frederic Chopin");
    }
    public void showDmitriSelect(View view) {
        displayToast("Dmitric Shostakovich");
    }
    public void showGyorgySelect(View view) {
        displayToast("Gyorgy Ligeti");
    }


    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


}