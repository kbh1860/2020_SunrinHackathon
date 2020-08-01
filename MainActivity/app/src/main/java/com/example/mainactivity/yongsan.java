package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.DelegatedAdminReceiver;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.DataTruncation;
import java.util.ArrayList;
import java.util.List;

public class yongsan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yongsan);

        ListView list = (ListView) findViewById(R.id.yongsanListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("마마카롱 : 010-6857-0060");
        data1.add("리탐빌 since1999 : 02-3448-9901");
        data1.add("서울특별시 중부기술교육원 : 02-361-5800");
        data1.add("밤비니어학원 : 02-319-0579");
        data1.add("리프스튜디오 : 02-792-2019");
        data1.add("포지티브 : 02-797-1171");
        data1.add("스테이지631 : 02-6261-6310");
        data1.add("한국오토모티브컬리지 : 02-6925-6969");
        data1.add("서울중장비직업전문학교 : 02-796-2245");
        data1.add("국제칵테일전문학원 : 02-701-3933");
        data1.add("자이요가명상 한남지점 : 02-793-9642");
        data1.add("SDA삼육어학원남영학원 : 02-706-3605");
        data1.add("한국커피교육센터 : 02-6080-9833");
        data1.add("JM다이브 스킨스쿠버 : 010-9165-2209");
        data1.add("헤리티지 : 02-318-2989");
        data1.add("윤원준기타교실 음악학원 : 02-715-8253");
        data1.add("포도클럽 : 02-790-8580");
        data1.add("공간46길 : 010-6680-0927");
        data1.add("최병철펜싱클럽 : 02-6929-4728");
        data1.add("아리랑스쿨 : 010-3040-8705");
        adapter.notifyDataSetChanged();
    }
}