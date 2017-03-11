package com.example.rai.customlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowAdapter extends AppCompatActivity {
    TextView titleText;
    TextView descText;
    ImageView imageView;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        titleText = (TextView)findViewById(R.id.showTextTitle);
        descText = (TextView)findViewById(R.id.showTextDesc);
        ImageView imageView = (ImageView)findViewById(R.id.showImg);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        String titleName =(String) b.get("title");
        String descName = (String)b.get("desc");
        int img= (Integer)b.get("image");
        titleText.setText(titleName);
        descText.setText(descName);
        imageView.setImageResource(img);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
