package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class Screen2 extends AppCompatActivity {
    private TextView text_name;
    private TextView text_age;
    private TextView text_address;
    private Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        this.text_name = (TextView) this.findViewById(R.id.text_name);
        this.text_age = (TextView) this.findViewById(R.id.text_age);
        this.text_address = (TextView) this.findViewById(R.id.text_address);
        this.btn_back = (Button)this.findViewById(R.id.btn_back);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");
        String address = intent.getStringExtra("address");
        text_name.setText(name);
        text_age.setText(age);
        text_address.setText(address);
        btn_back.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Screen2.this.finish();
            }

        });
    }
}