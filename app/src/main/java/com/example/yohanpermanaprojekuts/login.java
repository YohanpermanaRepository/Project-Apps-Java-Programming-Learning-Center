package com.example.yohanpermanaprojekuts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameInput = username.getText().toString().trim();
                String passwordInput = password.getText().toString().trim();

                if (usernameInput.equals("yohan") && passwordInput.equals("1234")) {
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);

                } else{
                    Intent kedua = new Intent(login.this,register.class);
                    startActivity(kedua);
                }
            }
        });
    }

    public void jikareg(View view) {
        Intent kedua = new Intent(this, register.class);
        startActivity(kedua);

    }
}
