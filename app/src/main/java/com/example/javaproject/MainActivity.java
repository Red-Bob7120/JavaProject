package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Toast;

import com.example.javaproject.word.WordListActivity;
import com.example.javaproject.stats.StatsDashboardActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   // ← 기존 방식 유지

        // ------------------------
        //     바텀바 공통 처리
        // ------------------------

        // 홈 (현재 화면)
        findViewById(R.id.btnHome).setOnClickListener(v -> {
            recreate();   // 메인 새로고침
        });

        // 단어장 이동
        findViewById(R.id.btnWord).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WordListActivity.class);
            startActivity(intent);
        });

        // 통계 → 통계 화면 이동
        findViewById(R.id.btnStats).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StatsDashboardActivity.class);
            startActivity(intent);
        });

        // 검색 (아직 미구현)
        findViewById(R.id.btnSearch).setOnClickListener(v ->
                Toast.makeText(this, "아직 준비 중입니다", Toast.LENGTH_SHORT).show()
        );

        // 프로필 (아직 미구현)
        findViewById(R.id.btnProfile).setOnClickListener(v ->
                Toast.makeText(this, "아직 준비 중입니다", Toast.LENGTH_SHORT).show()
        );

        // ------------------------
        //     메인 상단 카드
        // ------------------------
        findViewById(R.id.statsCard).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StatsDashboardActivity.class);
            startActivity(intent);
        });
    }
}
