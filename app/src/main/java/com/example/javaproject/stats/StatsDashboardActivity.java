package com.example.javaproject.stats;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.javaproject.common.BottomBarHelper;
import com.example.javaproject.R;

public class StatsDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_dashboard);

        BottomBarHelper.setup(this, "stats");   // ★ 고친 부분
    }
}
