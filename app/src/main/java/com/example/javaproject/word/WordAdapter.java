package com.example.javaproject.word;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javaproject.R;

import java.util.ArrayList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    private ArrayList<WordData> list;

    public WordAdapter(ArrayList<WordData> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_word, parent, false);
        return new WordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        WordData data = list.get(position);

        holder.tvWord.setText(data.getWord());
        holder.tvMeaning.setText(data.getMeaning());

        if (data.isMastered()) {
            holder.tvStatus.setText("완료");
            holder.tvStatus.setTextColor(0xFF4CAF50);
        } else {
            holder.tvStatus.setText("미완료");
            holder.tvStatus.setTextColor(0xFFF44336);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class WordViewHolder extends RecyclerView.ViewHolder {

        TextView tvWord, tvMeaning, tvStatus;

        public WordViewHolder(@NonNull View itemView) {
            super(itemView);

            tvWord = itemView.findViewById(R.id.tvWord);
            tvMeaning = itemView.findViewById(R.id.tvMeaning);
            tvStatus = itemView.findViewById(R.id.tvStatus);
        }
    }
}
