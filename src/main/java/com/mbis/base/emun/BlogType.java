package com.mbis.base.emun;

/**
 * Created by uwayxs on 2017/5/11.
 */
public enum  BlogType {

    TECHNOLOGY("科技类"),
    ECONOMIC("经济类"),
    SOCIETY("社会类"),
    OTHERS("其他类");
    private String title;
    BlogType(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
