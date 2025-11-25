package com.example.javaproject.word;

public class WordData {
    private String word;
    private String meaning;
    private boolean isMastered;

    public WordData(String word, String meaning, boolean isMastered) {
        this.word = word;
        this.meaning = meaning;
        this.isMastered = isMastered;
    }

    public String getWord() { return word; }
    public String getMeaning() { return meaning; }
    public boolean isMastered() { return isMastered; }
}
