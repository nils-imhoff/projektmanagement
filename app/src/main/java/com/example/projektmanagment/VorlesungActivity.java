package com.example.projektmanagment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

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
        EditText editVname = (EditText) findViewById(R.id.vname);
        String vorlesung = editVname.getText().toString();

        //Der Verstaendnisgrad wird aus dem Formular in einen String gespeichert
        EditText editGrad = (EditText) findViewById(R.id.grad);
        String grad = editGrad.getText().toString();


//        new AlertDialog.Builder(this)
//                .setTitle("Vorlesung!")
//                .setMessage(vorlesung + "\n" + grad)
//                .show();

//        Die ArrayListe Vorlesungen wird angelegt in der die Namen gespeichert werden
        ListView mListView = findViewById(R.id.ListVorlesung);
        ArrayList<Vorlesung> vorlesungen = new ArrayList<>();

        Vorlesung kurs = new Vorlesung(vorlesung, grad);
        vorlesungen.add(kurs);
        VorlesungListAdapter adapter = new VorlesungListAdapter(this, R.layout.adapter_view_layout, vorlesungen);
        mListView.setAdapter(adapter);
        setContentView(R.layout.activity_vorlesung_liste);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}

