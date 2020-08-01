package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class guro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guro);

        ListView list = (ListView) findViewById(R.id.guroListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("온수자동차운전전문학원 : 02-6971-7803");
        data1.add("신도림자동차운전전문학원 : 02-2672-8500");
        data1.add("퍼스트바리스타학원 구로점 : 02-6951-1512");
        data1.add("에듀윌 : 1600-6700");
        data1.add("랭귀지큐브 구로디지털점 : 02-2082-1105");
        data1.add("서울현대직업전문학교 구로캠퍼스 : 02-2638-0700");
        data1.add("그린컴퓨터아트학원 신도림캠퍼스 : 02-2111-2000");
        data1.add("더조은컴퓨터아트학원 구로캠퍼스 : 02-2082-1688");
        data1.add("4세대아카데미 컴퓨터학원 : 02-508-6604");
        data1.add("피아노리브레 구로디지털센터 : 02-853-9915");
        data1.add("라이딩클럽 : 02-856-7922");
        data1.add("키즈랜드어학원 : 02-2635-6773");
        data1.add("요가트리 : 070-8777-2040");
        data1.add("티엔티 스피치 & 보이스 아카데미 : 02-864-0117");
        data1.add("베스티안학원 : 02-2688-8926");
        data1.add("하이미디어컴퓨터학원 구로캠퍼스 : 02-3667-0008");
        data1.add("두산직업전문학교 : 02-2632-6675");
        data1.add("뮤직스토리음악학원 신도림점 : 02-864-7009");
        data1.add("라당스 스튜디오 : 010-9632-9422");
        data1.add("레베랑스 발레스튜디오 : 02-853-8293");
        adapter.notifyDataSetChanged();
    }
}