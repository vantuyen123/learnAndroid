package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText name,address,years,phone,username,password,re_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name =(EditText)findViewById(R.id.editTextName);
        address = (EditText)findViewById(R.id.editTextAddress);
        years = (EditText)findViewById(R.id.editTextYears);
        phone = (EditText)findViewById(R.id.editTextPhone);
        username = (EditText)findViewById(R.id.editTextUser);
        password = (EditText)findViewById(R.id.editTextPass);
        re_password = (EditText)findViewById(R.id.editTextRePassword);
    }

    public void register(View view) {
    }

    public void back(View view) {
        finish();
    }
}