package com.dongheekim.homepagehospital_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_1 = (Button)findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "감염병 정보로 넘어갑니다.", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this, btn1Activity.class);
                startActivity(intent);
            }
        });

        Button btn_2 = (Button)findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "질병리뷰로 넘어갑니다.", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this, btn2Activity.class);
                startActivity(intent);
            }
        });

        Button btn_3 = (Button)findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "감염병 확인으로 넘어갑니다.", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this, btn3Activity.class);
                startActivity(intent);
            }
        });

    }
}