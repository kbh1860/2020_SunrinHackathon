package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class seocho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seocho);

        ListView list = (ListView) findViewById(R.id.seochoListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("해커스어학원 강남역캠퍼스 본관 : 02-566-0001");
        data1.add("SBS아카데미컴퓨터아트학원 강남점:02-530-8555");
        data1.add("파고다어학원 강남 : 02-2051-4000");
        data1.add("W스피치커뮤니케이션 서울강남점 : 1644-0208");
        data1.add("사당자동차운전전문학원 : 02-591-6300");
        data1.add("양재 자동차운전전문학원 : 02-575-9500");
        data1.add("코리아취업아카데미 : 1588-0541");
        data1.add("올댓뷰티아카데미 강남점 : 02-555-2040");
        data1.add("해커스어학원 강남역캠퍼스 제1별관 : 02-566-0001");
        data1.add("굿잡컴퓨터아트학원 강남점 : 1588-8269");
        data1.add("WSA와인아카데미 : 02-516-3773");
        data1.add("edm아이엘츠 : 02-3444-8047");
        data1.add("코리아승무원학원 : 1588-2095");
        data1.add("퍼스트바리스타학원 강남점 : 02-2135-8396");
        data1.add("퍼스트제과제빵학원 강남점 : 02-2135-9293");
        data1.add("코리아요리학원 : 02-525-8335");
        data1.add("오피아어학원 강남점 : 02-582-0558");
        data1.add("퍼스트바리스타제과제빵학원 : 02-6952-6255");
        data1.add("박코치어학원강남캠퍼스 : 02-1577-7432");
        data1.add("메가스터디 교육 : 1544-2300");
        adapter.notifyDataSetChanged();
    }
}