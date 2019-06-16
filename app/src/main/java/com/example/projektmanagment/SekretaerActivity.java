package com.example.projektmanagment;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SekretaerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekretaer);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ListView mListView = findViewById(R.id.listView);
        ArrayList<Sekretaer> sekretaers = new ArrayList<>();
        //professoren.add(new Professor("", "", "", "", ""));
        final Sekretaer s1 = new Sekretaer("Carina Millow", "1.05", "0711/1849-4517", "0711/1849-4510", "carina.millow@dhbw-stuttgart.de", "Montag und Freitag: 9.00 bis 10.00 Uhr\n" +
                "Dienstag bis Donnerstag: 9.00 bis 11.00 Uhr und 12.30 bis 13.30 Uhr");
        sekretaers.add(s1);
        sekretaers.add(new Sekretaer("Christine Rohne", "1.03", "0711/1849-4513", "0711/1849-4510", "christine.rohne@dhbw-stuttgart.de", "Montag und Freitag: 9.00 bis 10.00 Uhr\n" +
                "Dienstag bis Donnerstag: 9.00 bis 11.00 Uhr und 12.30 bis 13.30 Uhr"));
        sekretaers.add(new Sekretaer("Andrea Dölker", "1.01", "0711/1849-4516", "0711/1849-4510", "andrea.doelker@dhbw-stuttgart.de", "Montag und Freitag: 9.00 bis 10.00 Uhr\n" +
                "Dienstag bis Donnerstag: 9.00 bis 11.00 Uhr und 12.30 bis 13.30 Uhr"));
        SekretaerListAdapter adapter = new SekretaerListAdapter(this, R.layout.adapter_view_layout, sekretaers);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SekretaerDialog d = new SekretaerDialog(s1);
                d.show(getSupportFragmentManager(), "Text");

            }
        });
    }

}
