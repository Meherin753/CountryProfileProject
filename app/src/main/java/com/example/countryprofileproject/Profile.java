package com.example.countryprofileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    private ImageView imageview;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageview = findViewById(R.id.ImageViewId);
        textView = findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String countryName = bundle.getString("name");
            showDetails(countryName);

        }


    }

    void showDetails(String country)
    {
        if(country.equals("Bangladesh"))
        {
            imageview.setImageResource(R.drawable.bangladesh);
            textView.setText(R.string.Bangladesh_Text);
        }


        if(country.equals("India"))
        {
            imageview.setImageResource(R.drawable.india_icon);
            textView.setText(R.string.India_Text);
        }


        if(country.equals("Pakistan"))
        {
            imageview.setImageResource(R.drawable.pakistan_icon);
            textView.setText(R.string.Pakistan_Text);
        }
    }
}