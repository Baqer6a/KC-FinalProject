package com.example.ambstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class p3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3);

        Intent top5 = new Intent(p3.this, p5.class);

        ImageView SETTING1 = findViewById(R.id.SETTING1);
        SETTING1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(top5);
            }
        });


        TextView username3 = findViewById(R.id.username3);

        Intent top4 = new Intent(p3.this, P4.class);

        ImageView ambteam1 = findViewById(R.id.ambteam1);
        ambteam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(top4);
            }
        });

        Bundle BB = getIntent().getExtras();

        String username11 = BB.getString("name");

        username3.setText(username11);

        Intent top7 = new Intent(p3.this, p7.class);

        ImageView exstore = findViewById(R.id.exstore);
        exstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(top7);
            }
        });
    }
}