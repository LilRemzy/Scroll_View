package com.example.scroll_view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button commentButton = findViewById(R.id.button_comment);
        commentButton.setOnClickListener(v ->
                Toast.makeText(this, R.string.comment_submitted, Toast.LENGTH_SHORT).show());
    }
}