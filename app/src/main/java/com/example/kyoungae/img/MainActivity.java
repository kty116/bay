package com.example.kyoungae.img;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ListView listView = (ListView) findViewById(R.id.list_view);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <100 ; i++) {
            list.add(""+i);
        }

        Adapter adapter = new Adapter(this,list);
        listView.setAdapter(adapter);

    }

}
