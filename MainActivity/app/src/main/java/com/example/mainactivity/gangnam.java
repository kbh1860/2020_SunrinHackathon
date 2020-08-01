package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class gangnam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangnam);

        ListView list = (ListView) findViewById(R.id.gangnamListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("짱솔학원 : 02-556-2501");
        data1.add("YBM어학원 강남센터 : 02-565-0509");
        data1.add("가인아카데미 학원 : 02-565-2800");
        data1.add("이강학원 : 02-554-2005");
        data1.add("더프라임수학학원 : 02-567-9550");
        data1.add("강남대성학원 : 02-581-7888");
        data1.add("모노스학원 : 02-561-7488");
        data1.add("시대인재학원 : 02-552-2373");
        data1.add("프리미어학원 : 02-539-3370");
        data1.add("클라디학원 : 02-537-3222");
        data1.add("메이드학원 본점 : 02-561-8973");
        data1.add("대치명인학원 대치캠퍼스 : 02-552-0484");
        data1.add("퍼스널잉글리쉬 : 02-2051-5050");
        data1.add("예섬학원 : 02-558-8822");
        data1.add("미래탐구 대치캠퍼스 입시관 : 02-538-3372");
        data1.add("대맥학원 : 02-554-5445");
        data1.add("메가스터디 러셀 대치 : 02-2138-1010");
        data1.add("프린서플어학원 : 02-539-8963");
        data1.add("멘토스학원 : 02-557-0027");
        data1.add("스피크나우 강남점 : 02-568-1681");
        data1.add("대치제이프라임 : 02-552-2101");
        data1.add("강남청솔학원 : 02-556-9001");
        data1.add("대찬학원 : 02-554-2772");
        data1.add("필수학학원 : 1588-3558");
        data1.add("다원교육 고등대치본관 : 02-3454-1162");
        data1.add("이투스247학원 강남 : 02-556-0247");
        data1.add("선경어학원 : 02-568-9001");
        data1.add("정상어학원 : 1644-0500");
        data1.add("더원학원 대치점 : 02-508-5336");
        data1.add("삼보어학원 : 02-562-3630");
        adapter.notifyDataSetChanged();
    }
}