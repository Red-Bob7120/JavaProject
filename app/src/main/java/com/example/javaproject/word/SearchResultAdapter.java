package com.example.javaproject.word;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.javaproject.R;

import java.util.ArrayList;

public class SearchResultAdapter extends BaseAdapter {

    private Context ctx;
    private ArrayList<WordItem> list;

    public SearchResultAdapter(Context ctx, ArrayList<WordItem> list) {
        this.ctx = ctx;
        this.list = list;
    }

    public void update(ArrayList<WordItem> newList) {
        list = newList;
        notifyDataSetChanged();
    }

    @Override public int getCount() { return list.size(); }
    @Override public Object getItem(int i) { return list.get(i); }
    @Override public long getItemId(int i) { return i; }

    @Override
    public View getView(int i, View cv, ViewGroup parent) {

        if (cv == null) {
            cv = LayoutInflater.from(ctx).inflate(R.layout.item_search_result, parent, false);
        }

        TextView tvWord = cv.findViewById(R.id.tvWord);
        TextView tvMeaning = cv.findViewById(R.id.tvMeaning);
        ImageButton btnAdd = cv.findViewById(R.id.btnAdd);

        WordItem item = list.get(i);

        tvWord.setText(item.word);
        tvMeaning.setText(item.meaning);

        btnAdd.setOnClickListener(v -> {
            WordDataManager.add(ctx, new WordItem(item.word, item.meaning));
        });

        return cv;
    }
}
