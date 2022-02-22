package com.example.osmtoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.library.osmtoast.OSMToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cv1 = findViewById(R.id.total_card1);
        cv2 = findViewById(R.id.total_card2);
        cv3 = findViewById(R.id.total_card3);
        cv4 = findViewById(R.id.total_card4);
        cv5 = findViewById(R.id.total_card5);
        cv6 = findViewById(R.id.total_card6);
        cv7 = findViewById(R.id.total_card7);
        cv8 = findViewById(R.id.total_card8);
        cv9 = findViewById(R.id.total_card9);
        cv10 = findViewById(R.id.total_card10);
        cv11 = findViewById(R.id.total_card11);
        cv12 = findViewById(R.id.total_card12);
        cv1.setOnClickListener(this);
        cv2.setOnClickListener(this);
        cv3.setOnClickListener(this);
        cv4.setOnClickListener(this);
        cv5.setOnClickListener(this);
        cv6.setOnClickListener(this);
        cv7.setOnClickListener(this);
        cv8.setOnClickListener(this);
        cv9.setOnClickListener(this);
        cv10.setOnClickListener(this);
        cv11.setOnClickListener(this);
        cv12.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.total_card1)
            OSMToast.makeText(this, "Default Toast", OSMToast.LENGTH_LONG, OSMToast.DEFAULT).show();
        else if (v.getId() == R.id.total_card2)
            OSMToast.makeText(this, "Success Toast !", OSMToast.LENGTH_LONG, OSMToast.SUCCESS).show();
        else if (v.getId() == R.id.total_card3)
            OSMToast.makeText(this, "Error Toast", OSMToast.LENGTH_LONG, OSMToast.ERROR).show();
        else if (v.getId() == R.id.total_card4)
            OSMToast.makeText(this, "Warning Toast", OSMToast.LENGTH_LONG, OSMToast.WARNING).show();
        else if (v.getId() == R.id.total_card5)
            OSMToast.makeText(this, "Info Toast", OSMToast.LENGTH_LONG, OSMToast.INFO).show();
        else if (v.getId() == R.id.total_card6)
            OSMToast.makeText(this, "Confuse Toast", OSMToast.LENGTH_LONG, OSMToast.CONFUSING).show();
        else if (v.getId() == R.id.total_card7)
            OSMToast.makeText(this, "Default Toast with logo", OSMToast.LENGTH_LONG, OSMToast.DEFAULT, R.drawable.logo).show();
        else if (v.getId() == R.id.total_card8)
            OSMToast.makeText(this, "Success Toast with logo", OSMToast.LENGTH_LONG, OSMToast.SUCCESS, R.drawable.logo).show();
        else if (v.getId() == R.id.total_card9)
            OSMToast.makeText(this, "Error Toast with logo", OSMToast.LENGTH_LONG, OSMToast.ERROR, R.drawable.logo).show();
        else if (v.getId() == R.id.total_card10)
            OSMToast.makeText(this, "Warning Toast with logo", OSMToast.LENGTH_LONG, OSMToast.WARNING, R.drawable.logo).show();
        else if (v.getId() == R.id.total_card11)
            OSMToast.makeText(this, "Info Toast with logo", OSMToast.LENGTH_LONG, OSMToast.INFO, R.drawable.logo).show();
        else if (v.getId() == R.id.total_card12)
            OSMToast.makeText(this, "Confuse Toast with logo", OSMToast.LENGTH_LONG, OSMToast.CONFUSING, R.drawable.logo).show();
    }
}