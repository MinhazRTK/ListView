package com.batch2.m0nk3y.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] mylist = {"Wake up","Brushing","Breakfast","Go to University","Take Lunch","Finish Lab","Return Home"};
        ListAdapter myListAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mylist);
        ListView listView = findViewById(R.id.mylist);
        listView.setAdapter(myListAdapter);
    }
}
