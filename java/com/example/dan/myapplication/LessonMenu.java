package com.example.dan.myapplication;

public class LessonMenu{
    private String lessonMenuTitle;
    private String lessonJudul;
    private int imageLesson;

    public LessonMenu(String lessonMenuTitle, String judul, int imageLesson) {
        this.lessonMenuTitle = lessonMenuTitle;
        this.imageLesson = imageLesson;
        this.lessonJudul = judul;
    }

    public String getLessonMenuTitle() {
        return lessonMenuTitle;
    }

    public int getImageLesson() {
        return imageLesson;
    }

    public String getLessonJudul() {
        return lessonJudul;
    }
}
