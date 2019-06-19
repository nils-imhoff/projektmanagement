package com.example.projektmanagment;

import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VorlesungListAdapter extends ArrayAdapter<Vorlesung> {

    private static final String TAG = "VorlesungListAdapter";

    private Context mcontext;
    private int mresource;


    public VorlesungListAdapter(Context context, int resource, ArrayList<Vorlesung> objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.mresource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        String grad = getItem(position).getVerstaendnis();


        Vorlesung prof = new Vorlesung(name, grad);
        Vorlesung prof2 = getItem(position);

        LayoutInflater inflater = LayoutInflater.from(mcontext);
        convertView = inflater.inflate(mresource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);

        tvName.setText(name);


        return convertView;
    }
}
