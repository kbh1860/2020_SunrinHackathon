package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class youngdeungpo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youngdeungpo);

        ListView list = (ListView) findViewById(R.id.youngdeungpoListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("파고다어학원 여의도지점 : 02-6929-4000");
        data1.add("서울현대직업전문학교 : 02-2675-5800");
        data1.add("한국과학기술직업전문학교 : 02-6049-4071");
        data1.add("MBC아카데미뷰티스쿨 영등포캠퍼스 : 02-3667-7799");
        data1.add("스토리지 : 02-6745-5329");
        data1.add("중앙애견미용학원 신도림점 : 02-833-0039");
        data1.add("동아제과제빵기술학원 : 02-2672-4438");
        data1.add("김재규경찰학원 : 02-815-7112");
        data1.add("YBM어학원 영등포센터 : 02-2632-0509");
        data1.add("서울이용학원 : 02-2637-9555");
        data1.add("월스트리트 잉글리쉬 여의도센터 : 02-786-3636");
        data1.add("한국제과학교 : 02-843-6110");
        data1.add("피아노리브레 여의도센터 : 02-761-9115");
        data1.add("렛츠폴 : 010-6606-8318");
        data1.add("파고다원 여의도센터 : 02-783-4020");
        data1.add("한국능력개발직업전문학교 : 02-2632-3070");
        data1.add("이유제과제빵커피학원 : 02-2065-0066");
        data1.add("아뜰리에뷰티아카데미 영등포캠퍼스 : 02-2672-6705");
        data1.add("방송정보국제교육원 : 02-2658-1131");
        data1.add("아트콜라보랩 문래점 : 010-9207-0810");
        adapter.notifyDataSetChanged();
    }
}