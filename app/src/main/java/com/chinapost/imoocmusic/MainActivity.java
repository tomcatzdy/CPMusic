package com.chinapost.imoocmusic;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chinapost.imoocmusic.activity.BaseActivity;
import com.chinapost.imoocmusic.adapter.MusicGridAdapter;
import com.chinapost.imoocmusic.view.GridSpaceItemDecoration;

public class MainActivity extends BaseActivity {


    private static final String TAG = "MainActivity";
    private RecyclerView mRvGrid;
    private MusicGridAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        initNavBar(false,"中邮音乐",true);
        mRvGrid = fd(R.id.rv_grid);
        mRvGrid.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.tabWidth),mRvGrid));
        mAdapter = new MusicGridAdapter(this);
        mRvGrid.setLayoutManager(new GridLayoutManager(this,3));
        mRvGrid.setAdapter(mAdapter);
    }
}
