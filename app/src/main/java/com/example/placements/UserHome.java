package com.example.placements;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.google.android.material.button.MaterialButton;


import android.os.Bundle;

import android.os.Bundle;

public class UserHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        CardView A=findViewById(R.id.cardView);
        CardView B=findViewById(R.id.aa);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation =AnimationUtils.loadAnimation(UserHome.this,R.anim.card);
                A.startAnimation(animation);
                Uri uri = Uri.parse("https://unstop.com/hackathons/flipkart-grid-50-software-development-track-flipkart-grid-50-flipkart-686157?ref=G5CD6AG0"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation =AnimationUtils.loadAnimation(UserHome.this,R.anim.card);
                B.startAnimation(animation);
                Uri uri = Uri.parse("https://unstop.com/competitions/techsurf-2023-contentstack-690413?ref=Oe4iZCT7"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}