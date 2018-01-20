package com.eternel.read.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.eternel.read.bean.BookShelfBean;

/**
 * Created by etenel on 2018/1/20.
 */

public class BookShelfAdapter extends BaseQuickAdapter<BookShelfBean,BaseViewHolder> {
    public BookShelfAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(BaseViewHolder helper, BookShelfBean item) {

    }
}
