package com.example.projektmanagment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ProfessorDialog extends AppCompatDialogFragment {
    private Professor prof;

    public ProfessorDialog(Professor prof){
        super();
        this.prof = prof;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(prof.getName()).setMessage("Raum "  + prof.getRaumnummer()+ "\nTel. "+prof.getTelefonnummer()+"\nFax. "+prof.getFaxnummer()+"\nMail "+prof.getEmail()+"\nLink "+prof.getLink()).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
