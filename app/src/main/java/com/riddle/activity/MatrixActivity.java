package com.riddle.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.riddle.R;
import com.riddle.adapter.IntroductionPagerAdapter;
import com.riddle.adapter.MatrixPagerAdapter;
import com.squareup.picasso.Picasso;

/**
 * Created by Hoang on 3/16/2017.
 */

public class MatrixActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    ImageView btn_next, btn_previous;
    ViewPager pager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_matrix);
        initUI();
        initEvent();
    }

    /*Init UI*/
    public void initUI(){
        btn_next = (ImageView) findViewById(R.id.imgNext);
        btn_previous = (ImageView) findViewById(R.id.imgPrevious);
        pager = (ViewPager) findViewById(R.id.matrix_viewpager);
        pager.setAdapter(new MatrixPagerAdapter(this));
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
            case R.id.imgNext:
                pager.setCurrentItem(currentItem + 1);
                break;
            case R.id.imgPrevious:
                pager.setCurrentItem(currentItem - 1);
                break;
        }
    }
    public void setIamgeButton(int position)
    {
        if(position == 0)
        {
            Picasso.with(MatrixActivity.this).load(R.mipmap.btn_next).into(btn_next);
            Picasso.with(MatrixActivity.this).load(R.mipmap.btn_previous).into(btn_previous);
        } else if (position == 1){
            Picasso.with(MatrixActivity.this).load(R.mipmap.btn_previous).rotate(180f).into(btn_next);
            Picasso.with(MatrixActivity.this).load(R.mipmap.btn_next).rotate(180f).into(btn_previous);
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
