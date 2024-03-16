package com.example.a4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a4.ThirdActivity;

public class SecondActivity extends AppCompatActivity {

    TextView userInfoTextView;
    EditText subjectEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        userInfoTextView = findViewById(R.id.userInfoTextView);
        subjectEditText = findViewById(R.id.subjectEditText);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("Имя");
        String lastName = intent.getStringExtra("Фамилия");

        userInfoTextView.setText("Имя: " + firstName + "\nФамилия: " + lastName);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject = subjectEditText.getText().toString();

                Intent resultIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                resultIntent.putExtra("Предмет", subject);
                startActivity(resultIntent);
            }
        });
    }
}
