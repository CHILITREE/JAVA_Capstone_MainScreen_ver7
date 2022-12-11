package com.dongheekim.homepagehospital_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class btn3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check);

        ImageView btnback_3 = (ImageView)findViewById(R.id.btnback_3);
        btnback_3.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(btn3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}