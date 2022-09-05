package com.example.ambstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class P4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4);

        Intent top6 = new Intent(P4.this, p6.class);

        Button sh = findViewById(R.id.sh);
        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(top6);
            }
        });

    }
}