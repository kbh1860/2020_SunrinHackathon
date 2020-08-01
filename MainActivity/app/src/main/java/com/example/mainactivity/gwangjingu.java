package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class gwangjingu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gwangjingu);

        ListView list = (ListView) findViewById(R.id.gwangjinguListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("스타댄스학원 건대본점 : 02-444-4044");
        data1.add("일본가자 통역학원 : 02-457-8885");
        data1.add("YBM어학원 건대센터 : 02-464-0509");
        data1.add("톡톡어학원 건대점 : 02-6956-2431");
        data1.add("한국보건의료인국가시험원 : 1544-4244");
        data1.add("비트믹스 댄스스튜디오 본점 : 02-464-4644");
        data1.add("한국커피추출센터 : 070-4177-9717");
        data1.add("카페플래닝커피학원 : 02-458-1374");
        data1.add("창조의아침미술학원 광진캠퍼스 : 02-447-4900");
        data1.add("위드피아노 건대점010-3434-9374");
        data1.add("피아노리브레 건대센터 : 02-469-9915");
        data1.add("미대편입이드 건대본원 : 02-464-9197");
        data1.add("아트앤하트 : 1644-3669");
        data1.add("발레미학 : 02-6383-3009");
        data1.add("왕지로얄발레 : 010-6444-7112");
        data1.add("택틱스어학원 : 031-398-0902");
        data1.add("플래뮤 광진교육원 : 010-9618-0780");
        adapter.notifyDataSetChanged();
    }
}