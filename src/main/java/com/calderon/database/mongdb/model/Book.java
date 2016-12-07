package com.calderon.database.mongdb.model;

import java.util.List;

/**
 * Created on 12/7/16.
 */
public class Book {
    private String title;
    private String isbn;
    private String date;
    private Publisher publisher;
    private boolean available;
    private int pages;
    private String[] subjects;
    private String language;
    private List<Note> notes;

    public Book(String title, String isbn, String date, Publisher publisher, boolean available, int pages, String[] subjects, String language, List<Note> notes) {
        this.title = title;
        this.isbn = isbn;
        this.date = date;
        this.publisher = publisher;
        this.available = available;
        this.pages = pages;
        this.subjects = subjects;
        this.language = language;
        this.notes = notes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
