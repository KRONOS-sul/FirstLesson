package com.example.firstlesson;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView tvFirst, tvSecond, tvThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViews();
        receiveData();
    }

    private void receiveData() {
        String nameData = getIntent().getStringExtra("name");
        String ageData = getIntent().getStringExtra("age");
        String sexData = getIntent().getStringExtra("sex");
        tvFirst.setText(nameData);
        tvSecond.setText(ageData);
        tvThird.setText(sexData);
    }

    private void findViews() {
        tvFirst = findViewById(R.id.tv_first);
        tvSecond = findViewById(R.id.tv_second);
        tvThird = findViewById(R.id.tv_third);
    }


}