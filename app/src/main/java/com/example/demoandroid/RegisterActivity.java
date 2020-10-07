package com.example.demoandroid;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private TextView getLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getLogin = findViewById(R.id.txtLogin);
        getLogin.setPaintFlags(getLogin.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    public void back(View view) {
        finish();
    }

    public void register(View view) {
    }

    public void login(View view) {
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }
}