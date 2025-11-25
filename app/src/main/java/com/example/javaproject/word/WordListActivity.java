package com.example.javaproject.word;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.javaproject.MainActivity;
import com.example.javaproject.R;
import com.example.javaproject.stats.StatsDashboardActivity;

import java.util.ArrayList;

public class WordListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        // -----------------------------
        // 1️⃣ 단어 더미 데이터 세팅
        // -----------------------------
        ArrayList<WordData> wordList = new ArrayList<>();
        wordList.add(new WordData("apple", "사과", false));
        wordList.add(new WordData("banana", "바나나", true));
        wordList.add(new WordData("study", "공부하다", false));
        wordList.add(new WordData("computer", "컴퓨터", true));

        RecyclerView recycler = findViewById(R.id.recyclerWordList);
        WordAdapter adapter = new WordAdapter(wordList);

        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));


        // -----------------------------
        // 2️⃣ 바텀바 공통 처리
        // -----------------------------

        // 홈
        findViewById(R.id.btnHome).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        });

        // 단어장 (현재 화면)
        findViewById(R.id.btnWord).setOnClickListener(v -> {
            // 현재 화면이므로 아무 동작 안 함
        });

        // 검색 (미구현)
        findViewById(R.id.btnSearch).setOnClickListener(v ->
                Toast.makeText(this, "아직 준비 중입니다", Toast.LENGTH_SHORT).show()
        );

        // 프로필 (미구현)
        findViewById(R.id.btnProfile).setOnClickListener(v ->
                Toast.makeText(this, "아직 준비 중입니다", Toast.LENGTH_SHORT).show()
        );

        // 통계 → 통계 화면으로 이동
        findViewById(R.id.btnStats).setOnClickListener(v -> {
            startActivity(new Intent(this, StatsDashboardActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }
}
