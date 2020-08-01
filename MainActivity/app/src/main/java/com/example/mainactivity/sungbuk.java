package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class sungbuk extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sungbuk);

        list = (ListView)findViewById(R.id.sungbukListview);

        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        data.add("성인취미미술아트아뜰리에 강북점 : 070-8860-0155");
        data.add("서경대 풋살파크 : 010-7568-7734");
        data.add("경비교육기관 내일능력개발원 : 02-3292-6111");
        data.add("성북커피학원 : 070-8828-6285");
        data.add("공감국어학원 : 02-921-7721");
        data.add("아이가답이다미술학원 : 02-6497-0101");
        data.add("엠뮤직아카데미 실용음악학원 : 02-953-6885");
        data.add("성인취미발레 : 010-2487-4240");
        data.add("뮤즈발레학원 : 02-3676-8890");
        data.add("강북세일학원 : 02-934-3131");
        data.add("성북종로학원 : 02-925-1881");
        data.add("YBM ECC 석계 : 02-952-0509");
        data.add("한양발레학원 : 02-928-6661");
        data.add("요가앤필 : 010-8871-0174");
        data.add("하이스트 성북캠퍼스 : 02-766-8215");
        data.add("리드101 돈암점 : 02-928-3101");
        adapter.notifyDataSetChanged();
    }
}