package com.example.projektmanagment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class VorlesungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vorlesung);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void sendMessage(View view){

        //Daten werden aus den Eingabe-Feldern gelesen:
        EditText editVname = (EditText) findViewById(R.id.vname);
        String vorlesung = editVname.getText().toString();

        //Der Verstaendnisgrad wird aus dem Formular in einen String gespeichert
        EditText editGrad = (EditText) findViewById(R.id.grad);
        String grad = editGrad.getText().toString();
//      Die Daten werden in eine Klasse und in eine ArrayList gepackt
        ArrayList<Vorlesung> vorlesungen = new ArrayList<>();

        Vorlesung kurs = new Vorlesung(vorlesung, grad);
        vorlesungen.add(kurs);
//        Neue Seite wird aufgerufen
        setContentView(R.layout.activity_vorlesung_liste);


//        Hier werden zwei TextViews erstellt
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.vorlesungen);
        TextView vTV = new TextView(this);
        vTV.setText(vorlesungen.get(0).getName());
        vTV.setGravity(Gravity.CENTER);
        vTV.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(vTV);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.grade);
        TextView vgTV = new TextView(this);
        vgTV.setText(vorlesungen.get(0).getVerstaendnis());
        vgTV.setGravity(Gravity.CENTER);
        vgTV.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout1.addView(vgTV);

        //Folgendes tut genau das gleiche wie drüben, dann nur werden textViews bereits erstellt
        //benötigt
//        TextView textView = (TextView) findViewById(R.id.fach1);
//        textView.setText(vorlesungen.get(0).getName());//set text for text view

//        TextView textView1 = (TextView) findViewById(R.id.grad1);
//        textView1.setText(vorlesungen.get(0).getVerstaendnis());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}

