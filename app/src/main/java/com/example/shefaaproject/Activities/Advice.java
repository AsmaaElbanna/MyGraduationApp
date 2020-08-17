package com.example.shefaaproject.Activities;

public class Advice {
    String diseasName;
    int diseasImage;

    public Advice (String diseasName, int diseasImage) {
        this.diseasName = diseasName;
        this.diseasImage = diseasImage;
    }

    public String getDiseasName() {
        return diseasName;
    }

    public int getDiseasImage() {
        return diseasImage;
    }
}
