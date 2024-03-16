package com.example.a4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    EditText dayEditText, timeEditText, commentsEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        dayEditText = findViewById(R.id.dayEditText);
        timeEditText = findViewById(R.id.timeEditText);
        commentsEditText = findViewById(R.id.commentsEditText);

        Button okButton = findViewById(R.id.okButton);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = dayEditText.getText().toString();
                String time = timeEditText.getText().toString();
                String comments = commentsEditText.getText().toString();


                Toast.makeText(ThirdActivity.this, "в " + day + " " + time + " часов" , Toast.LENGTH_SHORT).show();

                finish(); // Finish this activity and return to the previous one
            }
        });
    }
}
