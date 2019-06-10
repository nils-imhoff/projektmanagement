package com.example.projektmanagment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfessorListAdapter extends ArrayAdapter<Professor> {

    private static final String TAG = "ProfessorListAdapter";

    private Context mcontext;
    private int mresource;

    public ProfessorListAdapter(Context context, int resource, ArrayList<Professor> objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.mresource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        String email = getItem(position).getEmail();
        String telefonnummer = getItem(position).getTelefonnummer();
        String faxnummer = getItem(position).getFaxnummer();
        String raumnummer = getItem(position).getRaumnummer();

        Professor prof = new Professor(name, raumnummer, telefonnummer, faxnummer, email);
        Professor prof2 = getItem(position);

        LayoutInflater inflater = LayoutInflater.from(mcontext);
        convertView = inflater.inflate(mresource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);

        tvName.setText(name);

        return convertView;
    }
}
