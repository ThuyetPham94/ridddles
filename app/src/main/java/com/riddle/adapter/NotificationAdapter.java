package com.riddle.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.riddle.R;


/**
 * Created by Hoang on 3/22/2017.
 */

public class NotificationAdapter extends BaseAdapter {

    Context context;
    String[] content;
    String[] date;
    String[] time;

    public NotificationAdapter(Context context, String[] content, String[] date, String[] time) {
        this.context = context;
        this.content = content;
        this.date = date;
        this.time = time;
    }

    @Override
    public int getCount() {
        return 0;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.notification_list_item, parent, false);

        TextView tvContent = (TextView) rowView.findViewById(R.id.tvNotificationContent);
        TextView tvDate = (TextView) rowView.findViewById(R.id.tvNotificationDate);
        TextView tvTime = (TextView) rowView.findViewById(R.id.tvNotificationTime);

        //lấy Nội dung của Item ra để thiết lập nội dung item cho đúng
        tvContent.setText(content[position]);
        tvDate.setText(date[position]);
        tvTime.setText(time[position]);
        //lấy ImageView ra để thiết lập hình ảnh cho đúng

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked " + content[position], Toast.LENGTH_LONG).show();
            }
        });
        //trả về View này, tức là trả luôn về các thông số mới mà ta vừa thay đổi
        return rowView;
    }
}
