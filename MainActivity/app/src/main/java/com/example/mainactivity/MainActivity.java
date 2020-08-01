package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ACTIVITY_LC", "onCreate 호출됨");  // 상태 확인용
      
        Button buttonStart = (Button) findViewById(R.id.newActivity);
        buttonStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentStart = new Intent(getApplicationContext(),selectActivity.class);
                startActivity(intentStart);
                Toast.makeText(getApplicationContext(),"원하시는 메뉴를 눌러주세요!", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
