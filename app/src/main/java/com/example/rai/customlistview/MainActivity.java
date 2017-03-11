package com.example.rai.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView l;
    int position;
    String[] title = new String[] {"A", "B", "C"};
    String[] desc = new String[] {"HEllo", "How Are You?", "Okay"};
    int image[] = new int[] {R.mipmap.ic_launcher, R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (ListView)findViewById(R.id.list);
        CustomAdapter customAdapter = new CustomAdapter(this, title, desc, image);
        l.setAdapter(customAdapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ShowAdapt pos = new ShowAdapt(position);
                String titles = title[position] ;
                String descs = desc[position];
                int images = image[position];
                position = position;
                Intent i = new Intent(getApplicationContext(), ShowAdapter.class);
                i.putExtra("title", titles);
                i.putExtra("desc", descs);
                i.putExtra("image", images);
                startActivity(i);
            }
        });
    }
}