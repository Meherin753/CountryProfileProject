package com.example.countryprofileproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladeshButton,indiaButton,pakistanButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bangladeshButton = findViewById(R.id.Bangladesh);
        indiaButton = findViewById(R.id.India);
        pakistanButton = findViewById(R.id.Pakistan);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()== R.id.Bangladesh)
        {
            intent = new Intent(MainActivity.this,Profile.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }
        if(view.getId()== R.id.India)
        {
            intent = new Intent(MainActivity.this,Profile.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }
        if(view.getId()== R.id.Pakistan)
        {
            intent = new Intent(MainActivity.this,Profile.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder  alertDialog;
        alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setIcon(R.drawable.mark);
        alertDialog.setTitle(R.string.Title_text);

        alertDialog.setMessage(R.string.Message_text);
        alertDialog.setCancelable(false);

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog1 = alertDialog.create();
        alertDialog.show();



    }
}