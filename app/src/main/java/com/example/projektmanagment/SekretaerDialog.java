package com.example.projektmanagment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class SekretaerDialog extends AppCompatDialogFragment {
    private Sekretaer sek;

    public SekretaerDialog(Sekretaer sek){
        super();
        this.sek = sek;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(sek.getName()).setMessage("Raum "  + sek.getRaumnummer()+ "\nTel. "+sek.getTelefonnummer()+"\nFax. "+sek.getFaxnummer()+"\nMail "+sek.getEmail()).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
