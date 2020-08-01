package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class jungu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jungu);

        ListView list = (ListView) findViewById(R.id.junguListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);

        data1.add("메이븐랭귀지시청센터 : 02-736-1105");
        data1.add("주한영국문화원 성인어학원 을지로센터 : 1522-8006");
        data1.add("플라이포커스 패러글라이딩 스쿨 : 02-2679-8049");
        data1.add("MBC아카데미뷰티스쿨 동대문캠퍼스 : 02-6304-8888");
        data1.add("W스피치커뮤니케이션 서울시청점 : 1644-0208");
        data1.add("알리앙스 프랑세즈 : 02-755-4972");
        data1.add("패스트원 을지로센터 : 02-518-4823");
        data1.add("시청센터주한영국문화원어린이어학원 : 1522-5009");
        data1.add("디지틀조선일보캐나다문화어학원 : 02-3701-2700");
        data1.add("AIFA 우리경영아카데미 : 02-312-4321");
        data1.add("중구여성플라자 : 02-2236-9985");
        data1.add("위드피아노 왕십리점 : 010-2697-9374");
        data1.add("보이스코드 실용음악학원 약수점 : 02-2231-7999");
        data1.add("파워보컬 : 02-2238-0100");
        data1.add("신진직업교육원 : 02-6964-7011");
        data1.add("한양발레 서대문점 : 02-3789-1808");
        data1.add("쎄아떼이용미용전문학원 : 02-393-3363");
        data1.add("JEI재능교육 : 02-778-9003");
        data1.add("글로벌패션아카데미 : 02-778-9003");
        data1.add("오렌지애견미용학원 : 02-2279-7600");
        adapter.notifyDataSetChanged();
    }
}