package com.example.dan.myapplication.presentation;

/**
 * Created by DAN on 11/26/2017.
 */

public class LessonPresentationModel {
    private String lessonPresentationTitle;
    private String judulPresentation;
    private int imageLesson;

    public LessonPresentationModel(String lessonPresentationTitle, String judulPresentation, int imageLesson) {
        this.lessonPresentationTitle = lessonPresentationTitle;
        this.imageLesson = imageLesson;
        this.judulPresentation = judulPresentation;
    }

    public String getlessonPresentationTitle() {
        return lessonPresentationTitle;
    }

    public int getImagePresentation() {
        return imageLesson;
    }

    public String getJudulPresentation() {
        return judulPresentation;
    }
}
