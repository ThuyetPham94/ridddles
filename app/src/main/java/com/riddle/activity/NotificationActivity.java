package com.riddle.activity;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Hoang on 3/22/2017.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.riddle.R;
import com.riddle.adapter.NotificationAdapter;

public class NotificationActivity extends AppCompatActivity {
    public static String[] tvContent = {"Notification 1", "Notification 2", "Notification 3"};
    public static String[] tvDate = {"20/3/2017","21/3/2017","22/3/2017"};
    public static String[] tvTime = {"20h30", "19h15", "02h50"};

    ListView lvNotifications;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_notifications);

        lvNotifications = (ListView) findViewById(R.id.lvNotifications);
        lvNotifications.setAdapter(new NotificationAdapter(NotificationActivity.this, tvContent, tvDate,tvTime));
    }
}
