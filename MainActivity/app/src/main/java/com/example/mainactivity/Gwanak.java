package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Gwanak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gwanak);

        ListView list = (ListView) findViewById(R.id.GwanakListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("대한폴댄스연맹 서울대입구점 : 02-878-8285");
        data1.add("성인취미미술학원 문뜰리에 서울대입구점010-2805-4330");
        data1.add("윌비스 한림법학원 : 1544-1881");
        data1.add("에듀킨미용학원 신림캠퍼스 : 02-886-5218");
        data1.add("글로벌어학원 서울대입구점 : 02-877-0000");
        data1.add("합격의법학원 신림캠퍼스 : 02-888-3300");
        data1.add("태웅회관 : 02-883-9747");
        data1.add("댄스조아 구로디지털단지본점 : 02-868-5022");
        data1.add("민병철스피킹웍스 구로디지털점 : 02-858-0550");
        data1.add("성운보컬 RHT : 02-875-9903");
        data1.add("헬로우실용음악학원 : 02-882-8688");
        data1.add("문단열의 아이스펀지잉글리쉬 관악어학원 : 02-733-1205");
        data1.add("국제컴퓨터아카데미 : 02-2038-4293");
        data1.add("이지댄스 신림점 : 02-887-2227");
        data1.add("한국정보교육원 : 02-855-9611");
        data1.add("삐에스몽테 제빵소 : 02-875-8600");
        data1.add("브라운사운드보컬스튜디오 : 010-2238-4038");
        data1.add("관악뉴스터디학원 : 02-889-3111");
        data1.add("제일뷰티아카데미 : 02-867-7155");
        adapter.notifyDataSetChanged();
    }
}