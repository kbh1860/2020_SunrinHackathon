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

public class yangchun extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yangchun);

        list = (ListView)findViewById(R.id.yangchunListview);

        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        data.add("백인대장 목동점 : 02-2061-5588");
        data.add("시대인재 목동 : 02-2643-1237");
        data.add("발레리나 : 02-2646-2020");
        data.add("씨앤씨학원 목동관 : 02-2647-0770");
        data.add("씨앤씨학원 : 02-2643-2025");
        data.add("길벗수학학원 : 02-2062-1858");
        data.add("갈무리국어학원 : 02-2642-1177");
        data.add("준과학학원 : 02-2655-2279");
        data.add("꼼므크리제 : 010-6837-1685");
        data.add("본스타트레이닝센터 목동캠퍼스 : 02-516-6500");
        data.add("예일아카데미 보컬 댄스학원 : 1666-6236");
        data.add("청담어학원 목동브랜치 : 02-2694-9407");
        data.add("리뉴어학원 본관 : 02-2648-4476");
        data.add("청담어학원 목동제2캠퍼스 : 02-2646-9407");
        data.add("날개수학 : 02-2647-4321");
        data.add("이강학원 목동입시센터 : 02-6341-2005");
        data.add("백인대장훈련소 : 02-2061-5717");
        data.add("하이씨앤씨 프리미엄관 : 02-2648-7317");
        data.add("생각하는황소 목동점 : 02-2061-4949");
        data.add("종로학원 목동종로학원 : 02-2649-1881");
        adapter.notifyDataSetChanged();
    }
}