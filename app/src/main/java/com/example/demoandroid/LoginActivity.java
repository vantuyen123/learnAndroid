package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.editTextUser);
        password = (EditText) findViewById(R.id.editTextPass);
    }


    public void login(View view) {
        if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
            Toast.makeText(this, "Vui lòng điền tài khoản và mật khẩu", Toast.LENGTH_LONG).show();
        } else {
            if (username.getText().toString().equals("admin") && password.getText().toString().equals("123456")) {
                Intent resultActivity = new Intent(this, ResultActivity.class);
                startActivity(resultActivity);
            } else {
                Toast.makeText(this, "Tên tài khoản hoặc mật khẩu không đúng !", Toast.LENGTH_LONG).show();
            }
        }

    }

    public void register(View view) {
        Intent register = new Intent(this, RegisterActivity.class);
        startActivity(register);
    }

    public void back(View view) {
        finish();
    }
}