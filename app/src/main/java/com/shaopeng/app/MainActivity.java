package com.shaopeng.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.alibaba.fastjson.JSONArray;
import com.shaopeng.app.callback.OnPointDragListener;
import com.shaopeng.app.tools.DragPointAnimType;
import com.shaopeng.app.view.AbsDragPointView;
import com.shaopeng.app.view.DragPointView;

import java.util.List;


public class MainActivity extends AppCompatActivity implements OnPointDragListener {

    public List<DataBean> data;

    private DragPointView pointView1;
    private DragPointView pointView2;
    private DragPointView pointView3;
    private ListView listView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        initView();
        initSetting();
        initList();
    }

    private void initView() {
        pointView1 = (DragPointView) findViewById(R.id.drag_point_view1);
        pointView2 = (DragPointView) findViewById(R.id.drag_point_view2);
        pointView3 = (DragPointView) findViewById(R.id.drag_point_view3);
        listView = (ListView) findViewById(R.id.list);
    }


    private void initSetting() {
        pointView1.setRemoveAnim(DragPointAnimType.getAnimExplode(this, 300, 100, 100));
        pointView2.setRemoveAnim(DragPointAnimType.getAnimAlpha(100));
        pointView3.setRemoveAnim(DragPointAnimType.getAnimAlpha(100));
        pointView1.setOnPointDragListener(this);
    }

    private void initList() {
        data = JSONArray.parseArray(DataBean.TEST_JSON, DataBean.class);
        listView.setAdapter(new InfoAdapter(this, data));
        updateUnreadCount();
    }

    public void updateUnreadCount() {
        int totalUnreadCount = 0;
        for (DataBean entity : data) {
            totalUnreadCount += entity.getMessageNum();
        }
        if (totalUnreadCount > 0) {
            pointView1.setVisibility(View.VISIBLE);
            if (totalUnreadCount <= 99) {
                pointView1.setText(totalUnreadCount + "");
            } else {
                pointView1.setText("99+");
            }
        } else {
            pointView1.setVisibility(View.GONE);
        }
    }

    @Override
    public void onPointRemoveStart(AbsDragPointView view) {
        Log.e("aaaaaa","====+onRemoveStart");
        for (DataBean entity : data) {
            entity.setRead(true);
            entity.setMessageNum(0);
        }
    }

    @Override
    public void onPointRemoveEnd(AbsDragPointView view) {
        Log.e("aaaaaa","====+onRemoveEnd");
    }

    @Override
    public void onPointRecovery(AbsDragPointView view) {
        Log.e("aaaaaa","====+onRecovery");
    }
}
