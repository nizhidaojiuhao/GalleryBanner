package com.youth.banner.tools;

/**
 * @param <VH>
 */
public interface HolderCreator<VH extends BannerViewHolder> {

    /**
     * 创建ViewHolder
     */
    VH createViewHolder();
}
