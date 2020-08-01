package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class gangseo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangseo);

        ListView list = (ListView) findViewById(R.id.gangseoListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("서울 자동차운전전문학원 : 02-2665-6961");
        data1.add("서울호서직업전문학교 : 02-3660-0200");
        data1.add("폴라워폴댄스 : 010-9771-2823");
        data1.add("서울호서예술실용전문학교 서울캠퍼스예술관 : 02-2063-0700");
        data1.add("더조은컴퓨터학원 화곡점 : 02-2675-1750");
        data1.add("민병철어학원 강서점 : 02-3662-5005");
        data1.add("대한폴댄스연맹 마곡발산점 : 02-3664-8582");
        data1.add("비에이발레학원 : 02-6449-9639");
        data1.add("크리스챤쇼보 강서캠퍼스 : 02-2605-2079");
        data1.add("발레스튜디오 : 02-2698-8881");
        data1.add("커피인바리스타학원 화곡역점 : 02-2065-1020");
        data1.add("서강SLP 강서어학당 : 02-3661-2030");
        data1.add("엘발레스튜디오 마곡나루점 : 02-3663-1123");
        data1.add("톡앤티 : 02-2601-0029");
        data1.add("킹콩복싱짐 방화점 : 02-2661-1182");
        data1.add("강서제과학원 : 02-3664-5553");
        adapter.notifyDataSetChanged();
    }
}