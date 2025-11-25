package com.example.vocabdiary.model;

public class Favorite {
    public String word;
    public long added_at;

    public Favorite() {}

    public Favorite(String word, long added_at) {
        this.word = word;
        this.added_at = added_at;
    }
}
