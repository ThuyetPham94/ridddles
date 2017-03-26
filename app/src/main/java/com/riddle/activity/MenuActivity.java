package com.riddle.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.riddle.R;
import com.riddle.adapter.MenuLisviewAdapter;

/**
 * Created by Hoang on 3/22/2017.
 */

public class MenuActivity extends AppCompatActivity {
    public static int[] imgItems = {R.mipmap.ic_home, R.mipmap.ic_getcoin, R.mipmap.ic_guide, R.mipmap.ic_about, R.mipmap.ic_trophy_cabin, R.mipmap.ic_question, R.mipmap.ic_feedback, R.mipmap.ic_notification, R.mipmap.ic_logout};

    ListView lvMenuItems;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        String[] tvItemContent = {getResources().getString(R.string.home), getResources().getString(R.string.get_coins),getResources().getString(R.string.how_it_work),getResources().getString(R.string.trophy_cabinet), getResources().getString(R.string.about_app),
                getResources().getString(R.string.hint_and_super_hint), getResources().getString(R.string.feed_back), getResources().getString(R.string.notifications), getResources().getString(R.string.log_out)};
        initUI();

        MenuLisviewAdapter adapter = new MenuLisviewAdapter(tvItemContent, MenuActivity.this, imgItems);
        lvMenuItems.setAdapter(adapter);

    }
    public void initUI(){
        lvMenuItems = (ListView) findViewById(R.id.lvMenu);
    }
}
