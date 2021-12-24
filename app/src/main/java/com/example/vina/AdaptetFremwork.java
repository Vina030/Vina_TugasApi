package com.example.vina;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.vina.model.DataFremwork;

import java.util.ArrayList;

public class AdaptetFremwork extends ArrayAdapter {
    ArrayList<DataFremwork> dataFrameworks= new ArrayList();
    LayoutInflater layoutInflater;
    Context context;

    public AdaptetFremwork(Context context, ArrayList<DataFremwork> dataFrameworks) {
        super(context, R.layout.list_fremwork, dataFrameworks);
        this.dataFrameworks = dataFrameworks;
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.list_fremwork, parent, false);
        DataFremwork dataFramework = this.dataFrameworks.get(position);

        TextView titleListview = convertView.findViewById(R.id.titleListview);
        TextView authoListview = convertView.findViewById(R.id.authorListview);
        ImageView imageView = convertView.findViewById(R.id.imgListview);


        titleListview.setText(dataFramework.getNameFramework());
        authoListview.setText(""+dataFramework.getOriginal_author());

        return convertView;
    }
}