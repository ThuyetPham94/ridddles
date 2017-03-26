package com.riddle.adapter;

import com.riddle.R;
import com.riddle.request.BaseRequest;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by Hoang on 3/22/2017.
 */

public class MenuLisviewAdapter extends BaseAdapter {
    String[] result;
    Context context;
    int[] imageId;

    public MenuLisviewAdapter(String[] result, Context context, int[] imageId) {
        this.result = result;
        this.context = context;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.menu_list_items, parent, false);

        TextView tvContentItem = (TextView) rowView.findViewById(R.id.tvContentItem);
        ImageView imgItem = (ImageView) rowView.findViewById(R.id.imgItem);

        //lấy Nội dung của Item ra để thiết lập nội dung item cho đúng
        tvContentItem.setText(result[position]);
        //lấy ImageView ra để thiết lập hình ảnh cho đúng
        imgItem.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked " + result[position], Toast.LENGTH_LONG).show();
            }
        });
        //trả về View này, tức là trả luôn về các thông số mới mà ta vừa thay đổi
        return rowView;
    }


}
