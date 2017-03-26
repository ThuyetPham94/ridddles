package com.riddle.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.riddle.model.IntroductionModel;
import com.riddle.model.MatrixModel;

/**
 * Created by Hoang on 3/16/2017.
 */

public class MatrixPagerAdapter extends PagerAdapter {
    private Context mContext;
    public MatrixPagerAdapter(Context context){
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        MatrixModel modelObject = MatrixModel.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    public int getCount() {
        return MatrixModel.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        MatrixModel customPagerEnum = MatrixModel.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }
}
