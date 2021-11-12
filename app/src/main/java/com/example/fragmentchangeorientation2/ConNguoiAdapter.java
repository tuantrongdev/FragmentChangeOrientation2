package com.example.fragmentchangeorientation2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ConNguoiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ConNguoi> conNguoiList;

    public ConNguoiAdapter(Context context, int layout, List<ConNguoi> conNguoiList) {
        this.context = context;
        this.layout = layout;
        this.conNguoiList = conNguoiList;
    }

    @Override
    public int getCount() {
        return conNguoiList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class viewHolder {
        TextView txtTen;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
//ktra xem da co view hay chua
        if (convertView == null) {
            holder = new viewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.txtTen = convertView.findViewById(R.id.txtHoTen);
            convertView.setTag(holder);
        } else {
            holder = (viewHolder) convertView.getTag();
        }
// lay danh sach so nguoi trong data
        ConNguoi connguoi = conNguoiList.get(position);
        holder.txtTen.setText(connguoi.getTen());

        return convertView;
    }
}
