package com.example.schemelauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.run).setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("scheme://host"));
            intent.putExtra("welcome", "hello there!");

            startActivity(intent);
        });
    }
}