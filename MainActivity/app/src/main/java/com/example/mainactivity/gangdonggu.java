package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class gangdonggu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangdonggu);

        ListView list = (ListView) findViewById(R.id.gangdongguListview);

        List<String> data1 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data1);
        list.setAdapter(adapter);
        data1.add("퍼스트바리스타학원 천호점 : 02-474-8008");
        data1.add("더조은컴퓨터아트학원 천호캠퍼스 : 02-472-0645");
        data1.add("드림발레스튜디오 : 02-473-6137");
        data1.add("MBC아카데미뷰티스쿨 천호캠퍼스 : 02-6227-1005");
        data1.add("경일게임아카데미 : 02-479-4050");
        data1.add("에꼴드쉐프제과제빵학원 : 02-482-0080");
        data1.add("맥스체대입시 강동교육원 : 02-485-7111");
        data1.add("대신기술능력개발원 : 02-471-5555");
        data1.add("아피아 프리다이빙 : 02-484-2864");
        data1.add("강동하이레벨수학학원 : 02-2042-6000");
        data1.add("쉬즈네일 아카데미 천호점 : 02-488-7809");
        data1.add("강동유소년스포츠센터 : 02-3428-7979");
        data1.add("리틀팍스어학원 서울명일센터 : 02-3426-0594");
        data1.add("글로벌어학원 강동지사 : 02-477-6969");
        data1.add("하이미디어컴퓨터학원 천호캠퍼스 : 02-479-0009");
        adapter.notifyDataSetChanged();
    }
}