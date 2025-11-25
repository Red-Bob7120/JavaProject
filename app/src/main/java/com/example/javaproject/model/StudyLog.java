package com.example.vocabdiary.model;

public class StudyLog {
    public String word;
    public boolean is_correct;
    public long timestamp;

    public StudyLog() {} // Firestore 역직렬화용 기본 생성자

    public StudyLog(String word, boolean is_correct, long timestamp) {
        this.word = word;
        this.is_correct = is_correct;
        this.timestamp = timestamp;
    }
}
