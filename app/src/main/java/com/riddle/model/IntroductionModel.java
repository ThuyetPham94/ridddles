package com.riddle.model;

import com.riddle.R;

/**
 * Created by Hoang on 3/16/2017.
 */

public enum IntroductionModel {
    INRODUCTION_PAGE_1(R.string.introduction_page1, R.layout.introduction_page1),
    INRODUCTION_PAGE_2(R.string.introduction_page2, R.layout.introduction_page2),
    INRODUCTION_PAGE_3(R.string.introduction_page3, R.layout.introduction_page3);

    private int mTitleResId;
    private int mLayoutResId;

    IntroductionModel(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
