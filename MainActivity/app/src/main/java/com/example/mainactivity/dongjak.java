package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class dongjak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dongjak);

        ListView list = (ListView) findViewById(R.id.dongjackListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("공단기고시학원1관 : 02-812-6521");
        data1.add("삼삼오오스터디룸 : 010-5268-9335");
        data1.add("박문각남부고시학원남부본원 : 02-815-7819");
        data1.add("윌비스경찰학원 : 1544-6219");
        data1.add("합격스터디룸 : 010-9595-7959");
        data1.add("대산전기학원 : 02-816-0774");
        data1.add("조이스터디룸 : 010-5153-7959");
        data1.add("우부래도 : 070-7543-0599");
        data1.add("KG아이티뱅크 노량진학원 : 02-866-9357");
        data1.add("박문각임용고시학원 : 02-816-2030");
        data1.add("영가스파르타센터 노량진지점 : 010-4297-5678");
        data1.add("에듀윌 공무원학원 대방점 : 02-825-6677");
        data1.add("공단기고시학원3관 : 02-812-6521");
        data1.add("서울군무원학원 : 02-833-0522");
        data1.add("해커스공무원 노량진캠퍼스 : 02-599-0500");
        data1.add("에듀윌 공인중개사학원 대방점 : 02-815-0600");
        data1.add("대방전기통신학원 : 02-826-7942");
        data1.add("노량진 메가스터디학원 : 02-826-1555");
        data1.add("노량진스터디룸 : 010-4481-7949");
        data1.add("경단기 노량진학원02-812-6521");
        adapter.notifyDataSetChanged();
    }
}