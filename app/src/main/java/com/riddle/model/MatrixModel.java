package com.riddle.model;

import com.riddle.R;

/**
 * Created by Hoang on 3/16/2017.
 */

public enum MatrixModel {

    INRODUCTION_PAGE_2(R.string.matrix_page1, R.layout.matrix_page1),
    INRODUCTION_PAGE_3(R.string.matrix_page2, R.layout.matrix_page2);


    private int mTitleResId;
    private int mLayoutResId;

    MatrixModel(int titleResId, int layoutResId) {
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
