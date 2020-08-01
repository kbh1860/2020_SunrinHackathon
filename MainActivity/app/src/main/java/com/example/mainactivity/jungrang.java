package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class jungrang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jungrang);

        ListView list = (ListView) findViewById(R.id.jungrangListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("중랑자동차운전전문학원02-494-3355");
        data1.add("MV실용음악학원02-6204-0014");
        data1.add("본간호학원 중랑점02-432-0915");
        data1.add("아미고발레스쿨 중랑점02-433-2761");
        data1.add("올림피아드학원 중랑캠퍼스02-437-3200");
        data1.add("중랑직업전문학교02-493-2233");
        data1.add("스타요가02-3421-2230");
        data1.add("댄스스쿨 199802-491-1253");
        data1.add("온뮤직실용음악학원 중랑캠퍼스02-3421-1970");
        data1.add("사랑나눔요양보호사교육원02-435-7191");
        data1.add("닥스어학원02-3422-0511");
        data1.add("한성미용직업전문학교02-436-8557");
        data1.add("착한실용음악학원02-977-4005");
        data1.add("이젠컴퓨터학원 상봉캠퍼스02-436-0421");
        data1.add("신내이바인어학원02-3423-0579");
        data1.add("수라 실용음악학원02-2208-6009");
        data1.add("플로어엑스 아크로바틱스쿨070-4194-3780");
        data1.add("대우직업능력개발원02-434-0222");
        data1.add("시그마수학학원02-3422-1003");
        data1.add("중앙애견미용학원 면목점02-455-8484");
        adapter.notifyDataSetChanged();
    }
}