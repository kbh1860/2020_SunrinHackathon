package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class songpa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songpa);

        ListView list = (ListView) findViewById(R.id.songpaListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("도도한화실 : 02-420-5519");
        data1.add("무토스 아트그라운드 : 02-423-7113");
        data1.add("성인취미미술아트아뜰리에 잠실점 : 070-7776-3176");
        data1.add("잠실스쿠버스쿨 : 02-2202-1333");
        data1.add("ABC쿠킹스튜디오 롯데월드몰점 : 02-3213-4538");
        data1.add("DYB 최선어학원 송파 : 02-424-7094");
        data1.add("로고스학원 : 02-416-5540");
        data1.add("발레포러스 잠실신천점 : 02-2203-3636");
        data1.add("서울패러글라이딩 : 02-3401-9322");
        data1.add("늘푸른수학원 : 02-413-2652");
        data1.add("바른소리 보컬스튜디오 : 010-8969-6128");
        data1.add("잠실 실내스키장 : 02-424-9606");
        data1.add("아트가든취미미술학원 : 02-400-3314");
        data1.add("얼라이브실용음악학원 : 02-2202-0420");
        data1.add("세움영어 : 02-6081-0784");
        data1.add("리에스프레소 : 02-571-3533");
        data1.add("kbec발레시어터 & 발레피트니스 : 02-420-7771");
        data1.add("클릭미술학원 : 02-424-2689");
        data1.add("국제미용예술직업전문학교 : 02-416-9121");
        data1.add("우프 : 010-3253-2358");
        adapter.notifyDataSetChanged();
    }
}