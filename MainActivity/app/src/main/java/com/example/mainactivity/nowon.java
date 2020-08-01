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

public class nowon extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowon);

        list = (ListView)findViewById(R.id.nowonListview);

        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        data.add("더원 학원 중계점 : 02-554-5441");
        data.add("강북청솔학원 : 02-934-9001");
        data.add("토피아어학원 중계캠퍼스 : 02-3392-0015");
        data.add("DYB 최선어학원 중계 : 02-934-7094");
        data.add("학림학원 중계고등캠퍼스 : 02-933-4747");
        data.add("유투엠수학학원 중계캠퍼스 : 02-933-4600");
        data.add("국풍2000국어학원 중계직영관 : 02-936-3907");
        data.add("조재필 수학학원 : 02-2091-1009");
        data.add("칼수학학원 : 02-933-4977");
        data.add("CMS에듀 중계영재교육센터 : 02-933-1880");
        data.add("승리어학원 : 02-935-0355");
        data.add("토피아 아카데미 : 02-3391-0013");
        data.add("랭콘잉글리쉬 중계캠퍼스 : 02-935-4005");
        data.add("표현어학원 중계캠퍼스 : 02-933-0502");
        data.add("폴리어학원 중계캠퍼스 : 02-6927-7659");
        data.add("과수원과학수학전문학원 : 02-938-6060");
        data.add("이투스 247학원 강북 : 02-942-0247");
        data.add("연희당 국어전문학원 : 02-931-0329");
        data.add("YBM ECC 노원 : 02-938-0509");
        data.add("SA독학재수학원 : 02-6435-3131");
        data.add("텐브릿지학원 : 02-952-5046");
        data.add("수학의 기술 중계점 : 02-934-7749");
        data.add("덕스어학원 중계캠퍼스 : 02-935-3349");
        adapter.notifyDataSetChanged();
    }
}