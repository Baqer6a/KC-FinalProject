package com.example.ambstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ambstore.databinding.ActivityMainBinding;
import com.google.android.material.textfield.TextInputEditText;

public class p2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        Button enter2 = findViewById(R.id.enter2);
        TextInputEditText username2 = findViewById(R.id.username2);

        enter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username11 = username2.getText().toString();
                Intent enter2 = new Intent(p2.this , p3.class);
                enter2.putExtra("name" ,username11);
                startActivity(enter2);
            }
        });
    }
}