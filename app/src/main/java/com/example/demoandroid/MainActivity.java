package com.example.demoandroid;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView txtRegister, forgotPass;
    private EditText username, password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtRegister = findViewById(R.id.txtRegister);
        forgotPass = findViewById(R.id.forgotPass);
        txtRegister.setPaintFlags(txtRegister.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        forgotPass.setPaintFlags(forgotPass.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    public void register(View view) {
        Intent register = new Intent(this, RegisterActivity.class);
        startActivity(register);
    }


    public void loginWithFacebook(View view) {
        Toast.makeText(this, "LOGIN WITH FACEBOOK", Toast.LENGTH_SHORT).show();
    }

    public void loginWithGoogle(View view) {
        Toast.makeText(this, "LOGIN WITH GOOGLE", Toast.LENGTH_SHORT).show();

    }

    public void forgotPassword(View view) {
        Intent forgotPass = new Intent(this, ForgotPassActivity.class);
        startActivity(forgotPass);
    }
}