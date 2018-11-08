package com.example.yeyi.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Wxz> wxzList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWxzs();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        WxzAdapter adapter = new WxzAdapter(wxzList);
        recyclerView.setAdapter(adapter);
    }

    private void initWxzs() {
        for(int i = 0; i < 20; i++ ){
            Wxz chiregou = new Wxz("吃热狗",R.drawable.chiregou);
            wxzList.add(chiregou);
            Wxz igwxz = new Wxz("王校长",R.drawable.igwxz );
            wxzList.add(igwxz);
            Wxz shilibiao =new Wxz("视力表",R.drawable.shilibiao);
            wxzList.add(shilibiao);
        }
    }
}
