package com.dongheekim.homepagehospital_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class btn2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);

        ImageView btnback_2 = (ImageView) findViewById(R.id.btnback_2);
        btnback_2.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(btn2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}