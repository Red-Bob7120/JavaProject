package com.example.vocabdiary.model;

public class StatsData {
    public long correct;
    public long wrong;
    public long total;

    public StatsData() {}

    public StatsData(long correct, long wrong) {
        this.correct = correct;
        this.wrong = wrong;
        this.total = correct + wrong;
    }
}
