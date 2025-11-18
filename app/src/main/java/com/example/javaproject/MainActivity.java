package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = findViewById(R.id.pieChart);
        setupPieChart();
        loadPieChartData(30, 15, 10); // 예시: 완료 30개, 복습필요 15개, 미학습 10개
    }

    private void setupPieChart() {
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleRadius(65f);
        pieChart.setTransparentCircleRadius(70f);

        pieChart.setCenterText("오늘 학습률");
        pieChart.setCenterTextSize(14f);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);

        Legend legend = pieChart.getLegend();
        legend.setEnabled(false);   // 아래에 우리가 따로 범례 만들었으니까 숨김
    }

    private void loadPieChartData(int done, int review, int notYet) {
        List<PieEntry> entries = new ArrayList<>();
        if (done > 0) entries.add(new PieEntry(done, "완료"));
        if (review > 0) entries.add(new PieEntry(review, "복습"));
        if (notYet > 0) entries.add(new PieEntry(notYet, "미학습"));

        PieDataSet dataSet = new PieDataSet(entries, "학습 통계");
        List<Integer> colors = new ArrayList<>();
        colors.add(Color.parseColor("#4CAF50")); // 완료
        colors.add(Color.parseColor("#FF9800")); // 복습 필요
        colors.add(Color.parseColor("#E0E0E0")); // 미학습
        dataSet.setColors(colors);

        dataSet.setSliceSpace(2f);
        dataSet.setValueTextSize(12f);
        dataSet.setValueTextColor(Color.BLACK);

        PieData data = new PieData(dataSet);
        pieChart.setData(data);
        pieChart.invalidate(); // 갱신
    }
}
