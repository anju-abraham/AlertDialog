package com.example.user.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick=findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreateAlertDialog();
            }
        });
    }

    private void CreateAlertDialog()
    {
        final AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
        alertdialog.setTitle("Alert....!!!");
        alertdialog.setMessage("Are you sure you want delete this?");
        alertdialog.setIcon(R.drawable.ic_launcher_foreground);

        alertdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"You Clicked Yes",Toast.LENGTH_SHORT).show();
            }
        });

        alertdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"You clicked No",Toast.LENGTH_SHORT).show();
                dialogInterface.cancel();
            }
        });

        alertdialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"You clicked Cancel",Toast.LENGTH_SHORT).show();
            }
        });
        alertdialog.show();
    }
}
