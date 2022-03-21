package com.example.day0927;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day0927.dao.PickUpResendEntity2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView elv;
    private PickUpResendListAdapter mPickUpResendListAdapter;


    // 数据测试
    public List<String> groupEntity = new ArrayList<String>();
    public List<List<String>> entityBoxs =new ArrayList<List<String>>();    // 把所有人的相关的快递都获取出来
    List<PickUpResendEntity2> resendEntities = new ArrayList<PickUpResendEntity2>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findEntities(PickUpResendUtil.init()); // 初始化数据
        initPickUpresendView();
        initPickUpresendListener();
    }

    private void initPickUpresendListener() {
        //设置一级列表的点击事件
        elv.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                Toast.makeText(MainActivity.this, groupEntity.get(groupPosition), Toast.LENGTH_SHORT).show();
                //返回false 否则一级列表不会展开
                return false;
            }
        });

        //设置二级列表的点击事件
        elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                Toast.makeText(MainActivity.this, entityBoxs.get(groupPosition).get(childPosition), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    private void initPickUpresendView() {
        elv = findViewById(R.id.pickup_resend_boxs_lv);
        mPickUpResendListAdapter = new PickUpResendListAdapter(groupEntity, entityBoxs, this);
        elv.setAdapter(mPickUpResendListAdapter);
    }

    /*
    * 获取entities并获得对应的pickupResendList的父、子列表。
    * */
    private void findEntities(List<PickUpResendEntity2> resendEntities) {
        for(int i = 0;i<resendEntities.size();i++){ // 把每个Entity都给过一遍
            groupEntity.add(resendEntities.get(i).getPhoneNumber());
            List<String> IEntityBoxs = resendEntities.get(i).getBoxInWhere();   // 具体某个号码的快递柜
            entityBoxs.add(IEntityBoxs);
        }

    }

}
