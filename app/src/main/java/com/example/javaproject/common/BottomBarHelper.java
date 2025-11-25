package com.example.javaproject.common;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.javaproject.MainActivity;
import com.example.javaproject.R;
import com.example.javaproject.stats.StatsDashboardActivity;
import com.example.javaproject.word.WordListActivity;

public class BottomBarHelper {

    public static void setup(final Activity activity, String currentPage) {

        View stats = activity.findViewById(R.id.btnStats);
        View word = activity.findViewById(R.id.btnWord);
        View home = activity.findViewById(R.id.btnHome);
        View search = activity.findViewById(R.id.btnSearch);
        View profile = activity.findViewById(R.id.btnProfile);

        // ------- 클릭 기능 -------
        stats.setOnClickListener(v ->
                activity.startActivity(new Intent(activity, StatsDashboardActivity.class))
        );

        word.setOnClickListener(v ->
                activity.startActivity(new Intent(activity, WordListActivity.class))
        );

        home.setOnClickListener(v ->
                activity.startActivity(new Intent(activity, MainActivity.class))
        );

        search.setOnClickListener(v -> {});
        profile.setOnClickListener(v -> {});

        // ------- 선택된 메뉴 강조 -------
        highlight(activity, currentPage);
    }

    private static void highlight(Activity act, String page) {

        resetAll(act);

        switch (page) {
            case "home":
                setActive(act, R.id.btnHome);
                break;
            case "word":
                setActive(act, R.id.btnWord);
                break;
            case "stats":
                setActive(act, R.id.btnStats);
                break;
            case "profile":
                setActive(act, R.id.btnProfile);
                break;
            case "search":
                setActive(act, R.id.btnSearch);
                break;
        }
    }

    private static void resetAll(Activity act) {
        int[] ids = {R.id.btnStats, R.id.btnWord, R.id.btnHome, R.id.btnSearch, R.id.btnProfile};

        for (int id : ids) {
            View layout = act.findViewById(id);
            TextView txt = layout.findViewById(android.R.id.text1);
            ImageView img = layout.findViewById(android.R.id.icon);

            if (txt != null) txt.setTextColor(0xFF555555);
            if (img != null) img.setColorFilter(0xFF555555);
        }
    }

    private static void setActive(Activity act, int layoutId) {
        View layout = act.findViewById(layoutId);

        TextView txt = layout.findViewById(android.R.id.text1);
        ImageView img = layout.findViewById(android.R.id.icon);

        if (txt != null) txt.setTextColor(0xFF000000);
        if (img != null) img.setColorFilter(0xFF000000);
    }
}
