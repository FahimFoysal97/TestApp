package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import timber.log.Timber;

public class NewIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_intent);
        Person person = (Person) getIntent().getSerializableExtra("obj");
        Timber.d("Person object received");
        ((TextView)findViewById(R.id.textView_info)).setText(person.toString());
    }
}