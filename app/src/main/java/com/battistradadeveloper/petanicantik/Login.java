package com.battistradadeveloper.petanicantik;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText edt_password, edt_username;
    Button btn_login;
    ImageButton img_profile;
    TextView txt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        img_profile = (ImageButton)findViewById(R.id.user_profile_photo);

        txt_login = (TextView)findViewById(R.id.login_title);
        edt_password = (EditText)findViewById(R.id.edt_password);
        edt_username = (EditText)findViewById(R.id.edt_username);

        btn_login = (Button)findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = edt_username.getText().toString();
                String passwordKey = edt_password.getText().toString();
                if (usernameKey.equals("admin")&& passwordKey.equals("123")){
                    Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Username atau Password Anda Salah").setNegativeButton("Retry", null).create().show();

                }
            }
        });

    }
}
