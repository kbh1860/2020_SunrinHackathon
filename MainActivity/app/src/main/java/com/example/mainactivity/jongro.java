package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class jongro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jongro);

        ListView list = (ListView) findViewById(R.id.jongroListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("해커스어학원 종로캠퍼스 : 02-502-2000");
        data1.add("파고다어학원 종로타워 : 02-2274-4000");
        data1.add("YBM어학원 종로센터 : 02-2278-0509");
        data1.add("YBM어학원 e4u종로센터 : 02-2279-0509");
        data1.add("라인잉글리쉬 : 070-7687-5501");
        data1.add("랭귀지큐브 종로센터 : 02-734-1105");
        data1.add("서울호텔관광직업전문학교 : 02-2051-0044");
        data1.add("더블유아카데미컴퓨터학원 : 02-745-2170");
        data1.add("그린컴퓨터아트학원 종로캠퍼스 : 02-722-2111");
        data1.add("파고다 종로 : 02-2087-4000");
        data1.add("하이미디어컴퓨터학원 종로캠퍼스 : 02-723-0008");
        data1.add("서울게임아카데미 : 02-3676-8253");
        data1.add("대학로바리스타학원 : 02-765-6570");
        data1.add("서울직업전문학교 : 02-744-1472");
        data1.add("월스트리트 잉글리쉬 종로센터 : 02-737-3155");
        data1.add("시사일본어학원 종로캠퍼스 : 02-737-1582");
        data1.add("KG아이티뱅크 : 02-3672-6900");
        data1.add("세계전뇌학습 아카데미 : 02-722-4710");
        data1.add("퍼스트바리스타제과제빵학원 종로점 : 02-6956-7062");
        data1.add("종로호텔제과직업전문학교 : 02-736-1157");
        adapter.notifyDataSetChanged();
    }
}