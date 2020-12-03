package com.example.chattingzalo;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TinNhanAdapter extends BaseAdapter {
    private Context context;
    List<Message> list;

    public TinNhanAdapter(Context context, List<Message> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    private class ViewHolder{
        ImageView imgDaiDien;
        TextView txtTen, txtTinNhanGanNhat;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(view == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.dong_tinnhan, null);
            viewHolder.txtTen = view.findViewById(R.id.textviewten);
            viewHolder.txtTinNhanGanNhat = view.findViewById(R.id.textviewtinhangannhat);
            viewHolder.txtTinNhanGanNhat.setMaxLines(1);
            viewHolder.txtTinNhanGanNhat.setEllipsize(TextUtils.TruncateAt.END);
            viewHolder.imgDaiDien = view.findViewById(R.id.imageviewdaidien);
            view.setTag(viewHolder);
        }else{
            viewHolder = (TinNhanAdapter.ViewHolder) view.getTag();
        }
        Message message = (Message) getItem(position);
        viewHolder.txtTen.setText(message.getTen());
        viewHolder.txtTinNhanGanNhat.setText(message.getTinNhanGanNhat());
        viewHolder.imgDaiDien.setImageResource(message.getHinhDaiDien());
        return view;
    }
}
