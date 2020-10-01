package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class Screen1 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        this.textView1 = (TextView) this.findViewById(R.id.textView1);
        this.textView2 = (TextView) this.findViewById(R.id.textView2);
        this.button1 = (Button) this.findViewById(R.id.button1);
        this.button2 = (Button) this.findViewById(R.id.button2);
        //get data from MainActivity
        Intent intent = getIntent();
        String value1 = intent.getStringExtra("text1");
        String value2 = intent.getStringExtra("text2");
        this.textView1.setText(value1);
        this.textView2.setText(value2);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public  void onClick(View v){
                textView2.setText("Written by Van Tuyen");
            }
        });
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Screen1.this.finish();
            }
        });
    }
}