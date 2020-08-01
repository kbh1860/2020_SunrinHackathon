package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.BatchUpdateException;

public class SubActivity extends AppCompatActivity {

    private Object Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Log.d("ACTIVITY_LC", "onCreate 호출됨"); //상태 확인용

        Button button2 = (Button) findViewById(R.id.nowonActivity);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),nowon.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"노원구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button3 = (Button) findViewById(R.id.dobongActivity);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),dobong.class);
                startActivity(intent2);
                Toast.makeText(getApplicationContext(),"도봉구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button4 = (Button) findViewById(R.id.yongsanActivity);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(),yongsan.class);
                startActivity(intent3);
                Toast.makeText(getApplicationContext(),"용산구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button5 = (Button) findViewById(R.id.jongroActivity);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(),jongro.class);
                startActivity(intent4);
                Toast.makeText(getApplicationContext(),"종로구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button6 = (Button) findViewById(R.id.mapoActivity);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getApplicationContext(),mapo.class);
                startActivity(intent5);
                Toast.makeText(getApplicationContext(),"마포구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button7 = (Button) findViewById(R.id.yangchunActivity);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getApplicationContext(),yangchun.class);
                startActivity(intent6);
                Toast.makeText(getApplicationContext(),"양천구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button8 = (Button) findViewById(R.id.songpaActivity); // 화면 전환 버튼 순서 상관없음
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(getApplicationContext(),songpa.class);
                startActivity(intent7);
                Toast.makeText(getApplicationContext(),"송파구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button9 = (Button) findViewById(R.id.eunpyeongActivity);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(getApplicationContext(),enpyeong.class);
                startActivity(intent8);
                Toast.makeText(getApplicationContext(),"은평구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button10 = (Button) findViewById(R.id.gangnamActivity);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(getApplicationContext(),gangnam.class);
                startActivity(intent9);
                Toast.makeText(getApplicationContext(),"강남구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button11 = (Button) findViewById(R.id.gangbukActivity);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(getApplicationContext(),gangbuk.class);
                startActivity(intent10);
                Toast.makeText(getApplicationContext(),"강북구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button12 = (Button) findViewById(R.id.jungrangActivity);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(getApplicationContext(),jungrang.class);
                startActivity(intent11);
                Toast.makeText(getApplicationContext(),"중랑구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button13 = (Button) findViewById(R.id.sungbukActivity);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(getApplicationContext(),sungbuk.class);
                startActivity(intent12);
                Toast.makeText(getApplicationContext(),"성북구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button14 = (Button) findViewById(R.id.seodaemunActivity);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(getApplicationContext(),seodaemun.class);
                startActivity(intent13);
                Toast.makeText(getApplicationContext(),"서대문구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button15 = (Button) findViewById(R.id.dongdaemunActivity);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(getApplicationContext(),dongdaemun.class);
                startActivity(intent14);
                Toast.makeText(getApplicationContext(),"동대문구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button16= (Button) findViewById(R.id.junguActivity);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(getApplicationContext(),jungu.class);
                startActivity(intent15);
                Toast.makeText(getApplicationContext(),"중구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button17 = (Button) findViewById(R.id.sungdongguActivity);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(getApplicationContext(),sungdonggu.class);
                startActivity(intent16);
                Toast.makeText(getApplicationContext(),"성동구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });
        Button button18 = (Button) findViewById(R.id.gwangjinguActivity);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent17 = new Intent(getApplicationContext(),gwangjingu.class);
                startActivity(intent17);
                Toast.makeText(getApplicationContext(),"광진구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });
        Button button19 = (Button) findViewById(R.id.gangdongguActivity);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(getApplicationContext(),gangdonggu.class);
                startActivity(intent18);
                Toast.makeText(getApplicationContext(),"강동구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button20 = (Button) findViewById(R.id.seochoActivity);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent19 = new Intent(getApplicationContext(),seocho.class);
                startActivity(intent19);
                Toast.makeText(getApplicationContext(),"서초구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button21 = (Button) findViewById(R.id.dongjakActivity);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent20 = new Intent(getApplicationContext(),dongjak.class);
                startActivity(intent20);
                Toast.makeText(getApplicationContext(),"동작구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button22 = (Button) findViewById(R.id.GwankActivity);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent21 = new Intent(getApplicationContext(),Gwanak.class);
                startActivity(intent21);
                Toast.makeText(getApplicationContext(),"관악구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button23 = (Button) findViewById(R.id.geumchunActivity);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent22 = new Intent(getApplicationContext(),geumchun.class);
                startActivity(intent22);
                Toast.makeText(getApplicationContext(),"금천구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button24 = (Button) findViewById(R.id.youngdeungpoActivity);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent23 = new Intent(getApplicationContext(),youngdeungpo.class);
                startActivity(intent23);
                Toast.makeText(getApplicationContext(),"영등포구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button25 = (Button) findViewById(R.id.guroActivity);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent24= new Intent(getApplicationContext(),guro.class);
                startActivity(intent24);
                Toast.makeText(getApplicationContext(),"구로구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });

        Button button26 = (Button) findViewById(R.id.gangseoActivity);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent25 = new Intent(getApplicationContext(),gangseo.class);
                startActivity(intent25);
                Toast.makeText(getApplicationContext(),"강서구를 누르셨습니다!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}