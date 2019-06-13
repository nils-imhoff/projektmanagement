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

public class ProfessorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ListView mListView = findViewById(R.id.listView);
        ArrayList<Professor> professoren = new ArrayList<>();
        //professoren.add(new Professor("", "", "", "", ""));
        final Professor p1 = new Professor("Prof. Dr. Jan Hladik", "0.03", "0711/1849-4501", "0711/1849-4510", "jan.hladik@dhbw-stuttgart.de", "kein Link vorhanden");
        professoren.add(p1);
        professoren.add(new Professor("Prof. Dr.-Ing. Alfred Strey", "0.05", "0711/1849-4543", "0711/1849-4510", "alfred.strey@dhbw-stuttgart.de", ""));
        professoren.add(new Professor("Prof. Dr. rer. nat. Stephan Schulz", "0.01", "0711/1849-4519", "0711/1849-4510", "stephan.schulz@dhbw-stuttgart.de", ""));
        professoren.add(new Professor("Carina Millow", "1.05", "0711/1849-4517", "0711/1849-4510", "carina.millow@dhbw-stuttgart.de", ""));
        ProfessorListAdapter adapter = new ProfessorListAdapter(this, R.layout.adapter_view_layout, professoren);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ProfessorDialog d = new ProfessorDialog(p1);
                d.show(getSupportFragmentManager(), "Text");

            }
        });
    }

}
