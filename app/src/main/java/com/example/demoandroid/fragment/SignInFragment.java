package com.example.demoandroid.fragment;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.demoandroid.R;

import java.util.Calendar;

public class SignInFragment extends Fragment {
    TextView tv_time, forgotPass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signin,
                container,
                false);
        tv_time = (TextView) view.findViewById(R.id.tv_time);
        forgotPass = (TextView) view.findViewById(R.id.tvForgotPassword);
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        if (timeOfDay >= 0 && timeOfDay < 12) {
            tv_time.setText(getString(R.string.good_morign));
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            tv_time.setText(getString(R.string.good_afternoon));

        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            tv_time.setText(getString(R.string.good_evening));
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            tv_time.setText(getString(R.string.good_night));
        }
        forgotPass.setPaintFlags(forgotPass.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        return view;
    }
}
