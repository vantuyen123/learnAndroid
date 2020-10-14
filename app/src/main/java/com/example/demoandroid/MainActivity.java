package com.example.demoandroid;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.demoandroid.fragment.AuthenticateFragment;
import com.example.demoandroid.fragment.SignInFragment;
import com.example.demoandroid.fragment.SignUpFragment;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    ConstraintLayout constraintLayout;

    @SuppressLint("UseCompatLoadingForDrawables")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        constraintLayout = findViewById(R.id.fragment_main);
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        if (timeOfDay >= 0 && timeOfDay < 12) {
            constraintLayout.setBackground(getDrawable(R.drawable.good_morning_img));
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            constraintLayout.setBackground(getDrawable(R.drawable.good_morning_img));
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            constraintLayout.setBackground(getDrawable(R.drawable.good_night_img));
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            constraintLayout.setBackground(getDrawable(R.drawable.good_night_img));

        }
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.fragment_main, new AuthenticateFragment(), "authenticate");
        fragmentTransaction.addToBackStack("authenticate");
        fragmentTransaction.commit();
    }

    public void login(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.fragment_main, new SignInFragment(), "login");
        fragmentTransaction.addToBackStack("SignIn");
        fragmentTransaction.commit();
    }

    public void signUp(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.fragment_main, new SignUpFragment(), "register");
        fragmentTransaction.addToBackStack("register");
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            super.onBackPressed();
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }


}