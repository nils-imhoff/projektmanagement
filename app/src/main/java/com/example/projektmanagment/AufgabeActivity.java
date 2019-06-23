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


public class AufgabeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aufgabe);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void sendMessage(View view){

        //Daten werden aus den Eingabe-Feldern gelesen:
        EditText editAname = (EditText) findViewById(R.id.aname);
        String aufgabe = editAname.getText().toString();

        //Der Verstaendnisgrad wird aus dem Formular in einen String gespeichert
        EditText editAtext = (EditText) findViewById(R.id.atext);
        String atext = editAtext.getText().toString();
//      Die Daten werden in eine Klasse und in eine ArrayList gepackt
        ArrayList<Aufgabe> aufgaben = new ArrayList<>();

        Aufgabe auf = new Aufgabe(aufgabe, atext);
        aufgaben.add(auf);
//        Neue Seite wird aufgerufen
        setContentView(R.layout.activity_aufgabe_liste);


//        Hier werden zwei TextViews erstellt
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.aufgaben);
        TextView vTV = new TextView(this);
        vTV.setText(aufgaben.get(0).getName());
        vTV.setGravity(Gravity.CENTER);
        vTV.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(vTV);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.atexte);
        TextView vgTV = new TextView(this);
        vgTV.setText(aufgaben.get(0).getText());
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

