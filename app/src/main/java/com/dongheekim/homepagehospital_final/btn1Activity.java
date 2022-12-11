package com.dongheekim.homepagehospital_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class btn1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        ImageView btnback_1 = (ImageView)findViewById(R.id.btnback_1);
        btnback_1.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(btn1Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
