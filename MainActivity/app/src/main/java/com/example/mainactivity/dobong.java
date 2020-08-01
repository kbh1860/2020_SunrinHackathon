package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class dobong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobong);

        ListView list = (ListView) findViewById(R.id.dobongListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("창동자동차학원 : 02-907-7744");
        data1.add("성심케어센터 : 02-954-7025");
        data1.add("라인발레무용학원 : 02-904-5670");
        data1.add("인요가원 : 02-954-1717");
        data1.add("온뮤직실용음악학원 강북캠퍼스 : 02-991-1988");
        data1.add("포인댄스학원 : 02-904-6663");
        data1.add("뮤직앤기타 아카데미 : 010-8477-6930");
        data1.add("대양전기직업전문학교 : 02-907-7114");
        data1.add("온블리살롱 : 010-2870-0291");
        data1.add("김상엽제과제빵학원 : 02-991-1542");
        data1.add("개편한세상 : 02-6401-0010");
        data1.add("엔젤컴퓨터학원 : 02-900-5067");
        data1.add("아트미뇽 : 010-8674-7975");
        data1.add("창동카페바리스타학원 : 02-903-0990");
        data1.add("원투체육관 : 02-991-1282");
        data1.add("에이사운드 : 02-904-3930");
        data1.add("햇빛요양보호사교육원 : 02-902-0605");
        data1.add("배쓰그만미술학원 : 02-906-9838");
        data1.add("이반학원 : 02-996-8894");
        data1.add("이고스터디독학재수학원 : 02-998-8611");
        adapter.notifyDataSetChanged();
    }
}