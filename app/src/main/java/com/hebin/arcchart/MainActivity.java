package com.hebin.arcchart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hebin.numring.NumRing;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.doughnutView)
    LinearLayout doughnutView;
    @Bind(R.id.tv_rise_num)
    RiseNumberTextView tvRiseNum;
    @Bind(R.id.tv_num_01)
    TextView tvNum01;
    @Bind(R.id.tv_num_02)
    TextView tvNum02;
    @Bind(R.id.ll_num_ring)
    LinearLayout llNumRing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        doughnutView.removeAllViews();
        doughnutView.addView(new HomeArcView(this, 83));
        animText(tvRiseNum, 83);
        tvNum01.setText("当前人数为83人");
        tvNum02.setText("更新于12:00");
        setRing();
    }

    /**
     * 给一个TextView设置一个数字增长动画
     */
    private void animText(RiseNumberTextView tv, int number) {
        // 设置数据
        tv.withNumber(number);
        // 设置动画播放时间
        tv.setDuration(1500);
        tv.start();
    }


    /**
    * addview的方式实现一个圆环
    * */
    private void setRing(){
        llNumRing.addView(new NumRing(this, 90,"%","成交率"));
    }



}
