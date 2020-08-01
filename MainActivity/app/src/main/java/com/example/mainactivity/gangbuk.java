package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class gangbuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangbuk);

        ListView list = (ListView) findViewById(R.id.gangbukListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("퀸 실용음악학원 강북점 : 02-921-7002");
        data1.add("워너비요가 : 02-988-2213");
        data1.add("수유더쎄짐 무에타이 킥복싱다이어트 : 02-6012-3426");
        data1.add("신디 줌바 스튜디오 : 010-7763-7842");
        data1.add("국제체육관미아점복싱무에타이MMA주짓수 : 02-6015-1212");
        data1.add("체대입시FA 강북캠퍼스 : 02-991-1317");
        data1.add("본스타 강북수유캠퍼스 : 02-929-5252");
        data1.add("뷰티앤리더미용아카데미 : 02-946-1544");
        data1.add("유투엠수학학원 강북캠퍼스 : 02-2202-0909");
        data1.add("리하트요가 : 02-903-5008");
        data1.add("나오연기아카데미 : 070-7809-2862");
        data1.add("요가힐 강북구 미아동본원 : 02-980-0213");
        data1.add("조아라음악학원 : 02-984-3439");
        data1.add("제너럴커피아카데미 : 070-4618-3363");
        data1.add("컨트롤비트코리아댄스학원 : 02-995-7772");
        data1.add("난공불락스파르타 강북센터 : 02-991-7733");
        data1.add("노래교실후 : 02-994-7978");
        data1.add("모던폴스튜디오 : 010-7532-9012");
        adapter.notifyDataSetChanged();
    }
}