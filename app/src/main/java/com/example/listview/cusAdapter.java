package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class cusAdapter extends BaseAdapter {
    Context ctx;
    int layout;
    ArrayList<goods> arr;
    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public cusAdapter(Context ctx, int layout, ArrayList<goods> arr) {
        this.ctx = ctx;
        this.layout = layout;
        this.arr = arr;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layout,viewGroup,false);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvg = view.findViewById(R.id.tvg);
        ImageView imgGoods = view.findViewById(R.id.imgGoods);
        //g
        tvName.setText(arr.get(position).getName());
        tvg.setText(arr.get(position).getGia());
        imgGoods.setImageResource(arr.get(position).getInmagegoods());
        return view;
    }
}
