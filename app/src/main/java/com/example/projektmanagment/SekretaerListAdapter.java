package com.example.projektmanagment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SekretaerListAdapter extends ArrayAdapter<Sekretaer> {

    private static final String TAG = "SekretaerListAdapter";

    private Context mcontext;
    private int mresource;

    public SekretaerListAdapter(Context context, int resource, ArrayList<Sekretaer> objects) {
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
        String oeffnung = getItem(position).getOeffnung();

        Sekretaer sek = new Sekretaer(name, raumnummer, telefonnummer, faxnummer, email, oeffnung);
        Sekretaer sek2 = getItem(position);

        LayoutInflater inflater = LayoutInflater.from(mcontext);
        convertView = inflater.inflate(mresource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);

        tvName.setText(name);

        return convertView;
    }
}
