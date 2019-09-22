package com.example.bit603_as2_thomasmatoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView welcome;
    private EditText userName;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = (TextView)findViewById(R.id.tvWelcome);
        userName = (EditText)findViewById(R.id.etUsername);
        password = (EditText)findViewById(R.id.etPassword);

    }



}
