package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class sungdonggu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sungdonggu);

        ListView list = (ListView) findViewById(R.id.sungdongguListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("에듀킨아카데미 왕십리캠퍼스 : 02-2295-3306");
        data1.add("한사부 아크로바틱 트릭킹 폴댄스 학원 : 02-2231-7769");
        data1.add("프리미엄 모임카페 : 02-6956-8867");
        data1.add("케이맥스짐 : 070-8119-5056");
        data1.add("창조의아침미술학원 성동캠퍼스 : 02-2282-1355");
        data1.add("드럼치는감빵 : 02-2296-8057");
        data1.add("티니아트스쿨 : 02-3665-7323");
        data1.add("써밋 주니어골프 피트니스 : 02-446-1158");
        data1.add("발레포러스 한남옥수점 : 02-2203-1010");
        data1.add("발레 포레스트 : 010-6589-5020");
        data1.add("프랜시스파커 성동원 : 02-2295-0606");
        data1.add("올림피아드학원 성동캠퍼스 : 02-2294-7700");
        data1.add("라이즈어학원 성동점 : 02-2282-0706");
        data1.add("제일학원 : 02-2281-4747");
        data1.add("SUN YOGA : 010-7212-5127");
        data1.add("수수요가 : 010-9593-5258");
        data1.add("라온발레학원 : 02-464-7090");
        data1.add("라크렘 제과학원 : 02-6052-2041");
        data1.add("발레로 : 010-5796-9906");
        data1.add("미즈원어학원 : 02-2293-4886");
        adapter.notifyDataSetChanged();
    }
}