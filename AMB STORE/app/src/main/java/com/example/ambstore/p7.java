package com.example.ambstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class p7 extends AppCompatActivity {

    ArrayList<exitem> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p7);

        exitem Item1 = new exitem("موقع دفع", 2.0 , R.drawable.pay);
        exitem Item2 = new exitem("برنامج مونتاج", 1.0 , R.drawable.pr);
        exitem Item4 = new exitem("موقع فحص روابط", 1.0 , R.drawable.vi);
        exitem Item5 = new exitem("موقع بيع ادويه", 5.0 , R.drawable.ho);

        item.add(Item1);
        item.add(Item2);
        item.add(Item4);
        item.add(Item5);

        itemex itemAdapter = new itemex(this, 0, item);
        ListView lista = findViewById(R.id.lista);
        lista.setAdapter(itemAdapter);
    }
}