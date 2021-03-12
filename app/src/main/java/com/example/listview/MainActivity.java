package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    cusAdapter adt;
    ArrayList<goods> arrList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);
        arrList = new ArrayList<>();
        arrList.add(new goods("code","90$",R.drawable.code));
        arrList.add(new goods("google","90$",R.drawable.google));
        arrList.add(new goods("dev","90$",R.drawable.dev));
        arrList.add(new goods("download","90$",R.drawable.download));
        adt = new cusAdapter(this,R.layout.itemlistview,arrList);
        lvGoods.setAdapter(adt);
    }

}
