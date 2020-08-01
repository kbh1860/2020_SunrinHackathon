package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class geumchun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geumchun);

        ListView list = (ListView) findViewById(R.id.geumchunListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("서강직업전문학교 : 02-2637-6004");
        data1.add("하이프라임 어학원 : 02-2026-0594");
        data1.add("주경야독직업전문학교 : 02-395-3650");
        data1.add("캣츠댄스 학원 : 02-830-7006");
        data1.add("한국조리사관직업전문학교 : 02-2620-5743");
        data1.add("두잉커뮤니티 : 010-7245-6248");
        data1.add("EK티처 : 1644-3434");
        data1.add("랑그에튜 국어 & 영어 학원 : 02-804-0456");
        data1.add("예가직업전문기술학원 : 02-888-8419");
        data1.add("진학학원 : 02-809-4646");
        data1.add("글로벌산업기술교육원 : 02-1600-2923");
        data1.add("이화무용학원 : 02-863-2991");
        data1.add("보이스테크닉컴퍼니 금천점 : 02-804-3474");
        data1.add("훈스커피랩학원 : 02-834-1212");
        data1.add("구디아카데미 : 02-2108-5900");
        data1.add("플라잉 & 핫요가 by cosery 가산점 : 02-2026-0200");
        data1.add("진성요양보호사교육원 : 02-582-0577");
        data1.add("한신입시미술아뜨리에 : 02-899-6313");
        data1.add("라라요가 : 010-3148-8887");
        data1.add("YBM잉글루 문백제1캠퍼스 : 02-892-0205");





        adapter.notifyDataSetChanged();
    }
}