package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class dongdaemun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dongdaemun);

        ListView list = (ListView) findViewById(R.id.dongdaemunListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("SBS아카데미뷰티스쿨 동대문캠퍼스 : 02-923-0321");
        data1.add("EJ이화발레학원 답십리점 : 02-2246-1236");
        data1.add("SDA삼육어학원 서울본원 : 02-2211-3605");
        data1.add("한국항공직업전문학교 : 02-925-0037");
        data1.add("뮤즈타운음악연습실 : 010-4572-1174");
        data1.add("EJ이화발레학원 : 02-2242-1236");
        data1.add("한미제과요리커피학원 : 02-957-6080");
        data1.add("회기태웅회관 : 02-959-5809");
        data1.add("나레스트뷰티아카데미미용학원 청량리캠퍼스 : 02-957-0915");
        data1.add("올림피아드학원 동대문캠퍼스 : 02-2249-0909");
        data1.add("항공시대 : 02-929-9296");
        data1.add("남예종예술실용전문학교 : 1577-0967");
        data1.add("남서울실용전문학교 : 1522-0968");
        data1.add("수도학원 : 02-922-6703");
        data1.add("제일학원 : 02-930-5757");
        data1.add("예일어학원 : 02-2247-0594");
        data1.add("스포라이크 : 02-929-3949");
        data1.add("웨이실용음악학원 : 02-6497-8390");
        data1.add("아르떼음악학원 : 010-8654-9198");
        data1.add("서희주발레학원 : 02-2242-8988");
        adapter.notifyDataSetChanged();
    }
}