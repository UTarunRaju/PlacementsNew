package com.example.placements;

import android.widget.TextView;

public class User {

    TextView Fm,Ln,Usn,Email,Sem,Password;

    public User(TextView Fm,TextView Ln,TextView Usn,TextView Email,TextView Sem,TextView Password)
    {
        this.Ln=Ln;
        this.Fm=Fm;
        this.Usn=Usn;
        this.Email=Email;
        this.Sem=Sem;
        this.Password=Password;
    }

    public String Upload()
    {
        String H=Fm.getText().toString();
        H=H.concat("/ ");
        H=H.concat(Ln.getText().toString());
        H=H.concat("/ ");
        H=H.concat(Usn.getText().toString());
        H=H.concat("/ ");
        H=H.concat(Email.getText().toString());
        H=H.concat("/ ");
        H=H.concat(Sem.getText().toString());
        H=H.concat("/ ");
        H=H.concat(Password.getText().toString());

        return H;
    }
}
