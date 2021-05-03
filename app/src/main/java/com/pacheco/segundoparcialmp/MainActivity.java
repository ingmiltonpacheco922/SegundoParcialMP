package com.pacheco.segundoparcialmp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void iniciar(View view) {

        Toast toastloginOK = Toast.makeText(this, "LOGIN OK", Toast.LENGTH_SHORT);
        toastloginOK.show();
        Intent intent = new Intent(this, Formulario.class);
        startActivity(intent);
    }
}
