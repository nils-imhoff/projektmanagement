package com.example.projektmanagment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VorlesungActivity extends AppCompatActivity {

    public static final String EXTRA_FACH = "Hier steht das Fach";
    public static final String EXTRA_GRAD = "Hier steht der Grad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vorlesung);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void sendMessage(View view){
        EditText editVname = (EditText) findViewById(R.id.vname);
        String vorlesung = editVname.getText().toString();

        EditText editGrad = (EditText) findViewById(R.id.grad);
        String grad = editGrad.getText().toString();

        Vorlesung kurs = new Vorlesung(vorlesung, grad);

        new AlertDialog.Builder(this)
                .setTitle("Vorlesung!")
                .setMessage(kurs.getName())
                .show();

    }

}

