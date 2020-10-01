package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Screen3 extends AppCompatActivity {
    private EditText username, password;
    private Button login, register, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);


        this.username = (EditText) this.findViewById(R.id.editTextUser);
        this.password = (EditText) this.findViewById(R.id.editTextPass);
        this.login = (Button) this.findViewById(R.id.btn_Login);
        login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Vui lòng nhập vào tài khoản và mật khẩu :))", Toast.LENGTH_LONG).show();
                } else {
                    Intent resultScreen = new Intent(Screen3.this, ResultLogin.class);
                    Screen3.this.startActivity(resultScreen);
                }
            }
        });
        this.back = (Button) this.findViewById(R.id.btn_back);
        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen3.this.finish();
            }
        });
        this.register = (Button) this.findViewById(R.id.btn_Register);
        register.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrationScreen = new Intent(Screen3.this, Screen4.class);
                Screen3.this.startActivity(registrationScreen);
            }
        });

    }
}