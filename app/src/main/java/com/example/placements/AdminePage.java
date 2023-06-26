package com.example.placements;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;


import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.google.android.material.button.MaterialButton;
import android.os.Bundle;



public class AdminePage extends AppCompatActivity {

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
        setContentView(R.layout.activity_admine_page);
        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = findViewById(R.id.loginbtn);
        MaterialButton signUp = findViewById(R.id.siginbtn);


        TextView forgotpassword = findViewById(R.id.forgotpass);

        Runnable nextAction = new Runnable() {
            public void run() {
                clearText(username);
                clearText(password);
            }
        };

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("1") && password.getText().toString().equals("1"))
                {
                    Toast.makeText(AdminePage .this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(AdminePage.this, AdmineHome.class);
                    startActivity(i);
                    delayTime(nextAction,400);
                } else {
                    Toast.makeText(AdminePage.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        forgotpassword.setOnClickListener(v -> {

            Animation animation = AnimationUtils.loadAnimation(this, R.anim.click_animation);
            forgotpassword.startAnimation(animation);


            Runnable nextAction1 = new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(AdminePage.this, ForgotPassword.class);
                    startActivity(i);
                }
            };

            delayTime(nextAction1,150);
            delayTime(nextAction,150);


        });




        signUp.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(AdminePage.this, AdmineSignin.class);
                startActivity(i);
            }
        });



    }
}