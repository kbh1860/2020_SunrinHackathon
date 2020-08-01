package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class mapo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapo);

        ListView list = (ListView) findViewById(R.id.mapoListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("민병철어학원 홍대점 : 02-333-7100");
        data1.add("SBS아카데미컴퓨터아트학원 홍대점 : 02-312-9660");
        data1.add("성인취미미술아트아뜰리에 홍대점 : 070-4001-3176");
        data1.add("퍼스트바리스타학원 홍대점 : 02-2135-2192");
        data1.add("꾼실용음악학원 : 02-334-3092");
        data1.add("대한폴댄스연맹 홍대점 : 02-333-8285");
        data1.add("KMC홍대실용음악학원 : 02-3143-0525");
        data1.add("오면꽃예술학원 : 02-704-8641");
        data1.add("그린컴퓨터아카데미 신촌캠퍼스 : 02-715-2111");
        data1.add("신촌뉴실용음악학원 : 02-706-5577");
        data1.add("운전면허시험관리단 : 1577-1120");
        data1.add("대한폴댄스연맹 마포공덕점 : 02-711-8285");
        data1.add("코리아IT학원 신촌점 : 02-313-7300");
        data1.add("소마 마포센터 : 02-6959-8569");
        data1.add("커피 엠비에이 바리스타학원 : 02-3141-5641");
        data1.add("아이엠어바텐더 : 02-6497-1522");
        data1.add("발레숲 : 070-8733-1023");
        data1.add("엠플러스실용음악학원 : 02-323-4023");
        data1.add("톡톡어학원 홍대점 : 02-6949-2431");
        data1.add("오미크론수학학원 : 02-376-1234");
        adapter.notifyDataSetChanged();
    }
}