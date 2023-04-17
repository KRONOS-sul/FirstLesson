package com.example.firstlesson;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText etName, etAge, etSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setClicks();
    }

    private void navigate() {
        Intent intent = new Intent(this, SecondActivity.class);
        String nameMessage = etName.getText().toString();
        String ageMessage = etAge.getText().toString();
        String sexMessage = etSex.getText().toString();

        intent.putExtra("name", nameMessage);
        intent.putExtra("age", ageMessage);
        intent.putExtra("sex", sexMessage);

        startActivity(intent);
    }

    private void findViews() {
        button = findViewById(R.id.send_text_btn);
        etName = findViewById(R.id.et_name);
        etAge = findViewById(R.id.et_age);
        etSex = findViewById(R.id.et_sex);
    }

    private void setClicks() {
        button.setOnClickListener(v -> {
            if (!etName.getText().toString().isEmpty() &&
                    !etAge.getText().toString().isEmpty() &&
                    !etSex.getText().toString().isEmpty()) {
                navigate();
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            }
        });
    }

}