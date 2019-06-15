package com.example.projektmanagment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FachActivity extends AppCompatActivity {

    public static final String EXTRA_FACH = "Hier steht das Fach";
    public static final String EXTRA_GRAD = "Hier steht der Grad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fach);
        }


    /** Called when the user taps the Send button */
    public void sendMessage(View view)  {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editFach = (EditText) findViewById(R.id.fach);
        String messageFach = editFach.getText().toString();

        EditText editGrad = (EditText) findViewById(R.id.grad);
        String messageGrad = editGrad.getText().toString();

        intent.putExtra(EXTRA_FACH, messageFach);
        intent.putExtra(EXTRA_GRAD, messageGrad);
        startActivity(intent);
    }
}

