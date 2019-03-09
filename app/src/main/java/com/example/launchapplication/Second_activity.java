package com.example.launchapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.SPECIAL_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
    public void onClick(View view){
        TextView textView = findViewById(R.id.textView);
        Uri uri = Uri.parse("https://www.google.com/search?q="+textView.getText().toString());
        Intent gSearchIntent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(gSearchIntent);
    }
}
