package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import  android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    public String name = "Văn Tuyền";
    public String age = "22";
    public String address = "Đại Hưng - Khoái Châu - Hưng Yên";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button  = (Button)this.findViewById(R.id.button);
        this.button2 = (Button) this.findViewById(R.id.button2);
        this.button3 = (Button) this.findViewById(R.id.button3);
        this.button4 = (Button) this.findViewById(R.id.button4);

        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this,Screen1.class);
                myIntent.putExtra("text1","This is text 1 from MainActivity");
                myIntent.putExtra("text2","This is text 2 from MainActivity");
                MainActivity.this.startActivity(myIntent);
            }
        });
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this,Screen2.class);
                myIntent.putExtra("name",name);
                myIntent.putExtra("age",age);
                myIntent.putExtra("address",address);
                MainActivity.this.startActivity(myIntent);
            }
        });

        button3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this,Screen3.class);
                MainActivity.this.startActivity(myIntent);
            }

        });
        button4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this,Screen4.class);
                MainActivity.this.startActivity(myIntent);
            }

        });

    }

}