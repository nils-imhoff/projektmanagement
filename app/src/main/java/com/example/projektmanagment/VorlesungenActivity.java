package com.example.projektmanagment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class VorlesungenActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faecher);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String messageFach = intent.getStringExtra(FachActivity.EXTRA_FACH);
//        String messageGrad = intent.getStringExtra(FachActivity.EXTRA_GRAD);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(messageFach);

//        TextView dynamicTextView = new TextView(this);
//        dynamicTextView.setLayoutParams(new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT));
//        dynamicTextView.setText(messageFach);
    }
}
