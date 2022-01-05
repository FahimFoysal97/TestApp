package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickTheButton(View view){
        Toast.makeText(this, "I am Md Fahim Foysal", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), NewIntent.class);
        Person person = new Person("Md. Fahim Foysal",11428,"fahim.foysal@bjitgroup.com");
        intent.putExtra("obj", person);
        startActivity(intent);
    }

    public void navigateToMyProfileScreen(View view){
        Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
        startActivity(intent);
    }

}