package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by bdobre on 07/07/2017.
 */

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(Context c, List<News> news){
        super(c,0,news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        News currentNews = getItem(position);

        TextView section = listItemView.findViewById(R.id.news_section);
        section.setText(currentNews.getSection());

        TextView title = listItemView.findViewById(R.id.news_title);
        title.setText(currentNews.getTitle());

        return listItemView;
    }
}
