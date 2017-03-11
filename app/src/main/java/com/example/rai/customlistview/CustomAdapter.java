package com.example.rai.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sangitashres on 1/16/2017.
 */
public class CustomAdapter extends BaseAdapter {
    String[] title, desc;
    int[] img;
    int position;
    LayoutInflater inflater;

    public CustomAdapter(Context c, String[] t, String[] d, int[] i) {
        title = t;
        desc = d;
        img = i;
        inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi;
        vi = inflater.inflate(R.layout.activity_custom_list,null);
        TextView titleView = (TextView)vi.findViewById(R.id.titleText);
        TextView descView = (TextView)vi.findViewById(R.id.descTitle);
        ImageView image= (ImageView)vi.findViewById(R.id.image);
        titleView.setText(title[position]);
        descView.setText(desc[position]);
        image.setImageResource(img[position]);
        return vi;
    }
}
