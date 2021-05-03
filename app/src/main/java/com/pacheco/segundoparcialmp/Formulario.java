package com.pacheco.segundoparcialmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    public void Contenido(View view) {
        Intent intent= new Intent(this,Contenido.class);
        startActivity(intent);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
//*
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.poco:
                if (checked)
                    displayToast((getString(R.string.poco)));
                break;
            case R.id.medio:
                if (checked)
                    displayToast((getString(R.string.medio)));
                break;
            case R.id.mucho:
                if (checked)
                    displayToast(getString(R.string.mucho));
                break;
            default:
                break;
        }

    }
}