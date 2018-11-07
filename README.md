# GalleryBanner # Gallery效果的Banner
GalleryBanner 


## xml

```
<com.youth.banner.MyBanner
  android:id="@+id/banner"
  android:layout_width="match_parent"
  android:layout_height="300dp"
  app:banner_pageMargin="40dp" />
```

## Activity

```
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
```

## 效果
![avatar](/images/device-2018-11-07-125731.png)

