package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class selectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Log.d("ACTIVITY_LC", "onCreate 호출됨");  // 상태 확인용

        Button button2 = (Button) findViewById(R.id.selectArea);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"지역을 누르세요",Toast.LENGTH_SHORT).show();
            }
        });

        Button button3= (Button) findViewById(R.id.selectINFO);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Info.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"감사합니다 :D",Toast.LENGTH_SHORT).show();
            }
        });

    }

    }
