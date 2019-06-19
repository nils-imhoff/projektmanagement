package com.example.projektmanagment;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.projektmanagment.R;

import java.util.ArrayList;

public class VorlesungListActivity extends AppCompatActivity {

    String vorlesung = "Projektmanagement";
    String grad = "2";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        EditText editVname = (EditText) findViewById(R.id.vname);
//        String vorlesung = editVname.getText().toString();
//
//        //Der Verstaendnisgrad wird aus dem Formular in einen String gespeichert
//        EditText editGrad = (EditText) findViewById(R.id.grad);
//        String grad = editGrad.getText().toString();

//    Die ArrayListe Vorlesungen wird angelegt in der die Namen gespeichert werden
        ListView mListView = findViewById(R.id.ListVorlesung);
        ArrayList<Vorlesung> vorlesungen = new ArrayList<>();

        Vorlesung kurs = new Vorlesung(vorlesung, grad);
        vorlesungen.add(kurs);
        setContentView(R.layout.activity_vorlesung_liste);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
