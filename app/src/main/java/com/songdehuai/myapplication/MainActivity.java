package com.songdehuai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.songdehuai.myapplication.tools.CustomViewHolder;
import com.youth.banner.MyBanner;
import com.youth.banner.tools.BannerViewHolder;
import com.youth.banner.tools.HolderCreator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> imageList;

    MyBanner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageList = new ArrayList<>();
        imageList.add("http://i2.hdslb.com/bfs/archive/3f7fb29327e55c99c26ff3267a4581bd69bffe30.jpg");
        imageList.add("http://img3.duitang.com/uploads/item/201605/08/20160508230345_L3kWf.thumb.700_0.jpeg");
        imageList.add("http://img.zcool.cn/community/01ed5659466f7ca8012193a3df2cb3.jpg@2o.jpg");
        imageList.add("http://img.zcool.cn/community/014e1a58d20fb3a801219c77c11325.jpg@3000w_1l_2o_100sh.jpg");
        imageList.add("http://img.zcool.cn/community/01120a5a35ef48a80121db800ff48b.JPG@2o.jpg");
        imageList.add("http://i1.hdslb.com/bfs/archive/3ec7b54922c744970a26ffd879262b5c70225463.jpg");
        imageList.add("http://img.zcool.cn/community/01a79c5a35ef34a80121db80f67157.jpg@2o.jpg");

        banner = findViewById(R.id.banner);
        banner.setPageMargin(30);
        banner.setPages(imageList, new HolderCreator<BannerViewHolder>() {
            @Override
            public BannerViewHolder createViewHolder() {
                return new CustomViewHolder();
            }
        })
                .setAutoPlay(true)
                .setDelayTime(3000)
                .start();
    }
}
