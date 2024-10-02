package com.gamecodeschool.dialogdemo;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;

import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;

public class MyDialog  extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("Make Selection").setPositiveButton("Ok", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id) {

            }
        } ).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        return builder.create();
    }
}
