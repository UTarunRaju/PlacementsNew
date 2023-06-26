package com.example.placements;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.google.android.material.button.MaterialButton;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static void clearText(TextView A)
    {
        A.setText("");
    }

    public static  Handler handler = new Handler();
    public static void delayTime(Runnable R,long delay)
    {

        handler.postDelayed(R, delay);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView forgotpassword = findViewById(R.id.forgotpass);
        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        MaterialButton adminbtn = (MaterialButton) findViewById(R.id.adminbtn);
        MaterialButton siginbtn = (MaterialButton) findViewById(R.id.siginbtn);

        Runnable nextAction = new Runnable() {
            public void run() {
                clearText(username);
                clearText(password);
            }
        };

        siginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, UserSignin.class);
                startActivity(i);
                delayTime(nextAction,400);
            }
        });

        forgotpassword.setOnClickListener(v -> {

            Animation animation = AnimationUtils.loadAnimation(this, R.anim.click_animation);
            forgotpassword.startAnimation(animation);


            Runnable nextAction1 = new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(MainActivity.this, ForgotPassword.class);
                    startActivity(i);
                }
            };

            delayTime(nextAction1,150);
            delayTime(nextAction,150);


        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("1") && password.getText().toString().equals("1"))
                {
                    Toast.makeText(MainActivity .this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, UserHome.class);
                    startActivity(i);
                    delayTime(nextAction,400);
                } else {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        adminbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, AdminePage.class);
                startActivity(i);
                delayTime(nextAction,400);
            }
        });




    }
}