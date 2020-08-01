package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class seodaemun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seodaemun);

        ListView list = (ListView) findViewById(R.id.seodaemunListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("파고다어학원 신촌 : 02-717-4000");
        data1.add("YBM어학원 신촌센터 : 02-323-0509");
        data1.add("올댓뷰티아카데미 신촌점 : 02-313-0030");
        data1.add("퀸실용음악학원 : 02-312-8218");
        data1.add("KAC한국예술원 : 02-777-6133");
        data1.add("SBS아카데미게임학원 신촌점 : 02-363-5585");
        data1.add("이지댄스 신촌점 : 02-393-7773");
        data1.add("ANC승무원학원 강남지점 : 02-548-6744");
        data1.add("김영편입플러스 신촌캠퍼스 : 02-3142-7033");
        data1.add("파고다원 신촌센터 : 02-363-4020");
        data1.add("투비앤 아나운서 아카데미 학원 : 02-322-2997");
        data1.add("피아노리브레 신촌센터 : 02-337-9915");
        data1.add("서울탄츠스테이션 : 02-392-2011");
        data1.add("플라토어학원 : 02-391-0582");
        data1.add("댄스왕 : 02-313-9773");
        data1.add("블랙몽키스튜디오 2호점 : 010-5796-0700");
        data1.add("한국방송예술교육진흥원 : 02-761-2777");
        data1.add("서울예술실용전문학교 : 02-379-0007");
        data1.add("프리쏭 바이 스위트모먼트 : 010-4151-5951");
        data1.add("메가엠디 신촌 PEET종합반 전용관 : 02-363-2001");
        adapter.notifyDataSetChanged();
    }
}