package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class enpyeong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enpyeong);

        ListView list = (ListView) findViewById(R.id.enpyeongListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("체대입시FA 은평제2캠퍼스 : 02-921-1317");
        data1.add("명성학원 : 02-353-3500");
        data1.add("체대입시FA 은평제1캠퍼스 : 010-4090-6956");
        data1.add("이샘컴퓨터학원 : 02-358-2309");
        data1.add("뮤즈 댄스 스튜디오 : 02-354-5557");
        data1.add("은평컴퓨터아트학원 : 02-382-1881");
        data1.add("메가멘토스학원 : 02-385-0322");
        data1.add("위드피아노 연신내점 : 010-7630-9374");
        data1.add("은평구 연신내 듀벅실용음악학원 : 02-352-8950");
        data1.add("BB댄스아카데미 : 02-305-6913");
        data1.add("리브플라워앤아트학원 : 010-8678-2136");
        data1.add("카페원커피학원 : 070-8863-8395");
        data1.add("랑연기학원 : 02-308-0303");
        data1.add("이투스247학원 은평서대문 : 02-356-0247");
        data1.add("쥬발레아카데미학원 : 02-353-7787");
        data1.add("JYJ 폴댄스 : 02-389-3707");
        data1.add("뻔뻔아카데미 : 02-1522-9562");
        data1.add("전력기술교육원 : 02-309-4242");
        data1.add("소울퍼스널뷰티미용학원 : 02-352-0486");
        data1.add("키즈코 : 02-387-0584");
        adapter.notifyDataSetChanged();
    }
}