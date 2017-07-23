package com.example.android.newsapp;

/**
 * Created by bdobre on 07/07/2017.
 */

public class News {


    private String mTitle;
    private String mSection;
    private String mURL;

    public News(String title, String section,String url){
        mTitle = title;
        mSection = section;
        mURL = url;
    }
    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getURL(){ return mURL;}

}
