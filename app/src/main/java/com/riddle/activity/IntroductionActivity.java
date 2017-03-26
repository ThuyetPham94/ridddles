package com.riddle.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.riddle.R;
import com.riddle.adapter.IntroductionPagerAdapter;
import com.squareup.picasso.Picasso;

/**
 * Created by Hoang on 3/16/2017.
 */

public class IntroductionActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    ImageView btn_next, btn_previous;
    ViewPager pager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        initUI();
        initEvent();
    }

    /*Init UI*/
    public void initUI(){
        btn_next = (ImageView) findViewById(R.id.btn_next);
        btn_previous = (ImageView) findViewById(R.id.btn_previous);
        pager = (ViewPager) findViewById(R.id.introduction_viewpager);
        pager.setAdapter(new IntroductionPagerAdapter(this));
    }

    /*Init Event*/
    public void initEvent(){
        btn_next.setOnClickListener(this);
        btn_previous.setOnClickListener(this);
        pager.setOnPageChangeListener(this);
    }

    /*Bind Data*/
    public void bindData(){

    }

    @Override
    public void onClick(View v) {
        int currentItem = pager.getCurrentItem();
        switch (v.getId()) {
            case R.id.btn_next:
                pager.setCurrentItem(currentItem + 1);
                break;
            case R.id.btn_previous:
                pager.setCurrentItem(currentItem - 1);
                break;
        }
    }
    public void setIamgeButton(int position)
    {
        if(position == 0)
        {
            Picasso.with(IntroductionActivity.this).load(R.mipmap.btn_next).into(btn_next);
            Picasso.with(IntroductionActivity.this).load(R.mipmap.btn_previous).into(btn_previous);

        }
        else if (position == 1){
            Picasso.with(IntroductionActivity.this).load(R.mipmap.btn_next).into(btn_next);
            Picasso.with(IntroductionActivity.this).load(R.mipmap.btn_next).rotate(180f).into(btn_previous);
        }else if (position == 2){
            Picasso.with(IntroductionActivity.this).load(R.mipmap.btn_previous).rotate(180f).into(btn_next);
            Picasso.with(IntroductionActivity.this).load(R.mipmap.btn_next).rotate(180f).into(btn_previous);
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
            setIamgeButton(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
