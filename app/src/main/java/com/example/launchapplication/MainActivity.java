package com.example.launchapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public final static String SPECIAL_MESSAGE = "SPECIAL_MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void onClick(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        if(!editText.getText().toString().equals("")){
            Toast toast = Toast.makeText(this, editText.getText(),Toast.LENGTH_LONG);
            toast.show();
            Intent intent = new Intent(this, Second_activity.class);
            intent.putExtra(SPECIAL_MESSAGE, editText.getText().toString());
            startActivity(intent);
        }
    }
}
