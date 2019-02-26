package com.detroitlabs.photolibrary.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo {

    private String name;
    private LocalDate uploadDate;
    private ArrayList<String> tags;

    public Photo(String name, LocalDate uploadDate, ArrayList<String> tags) {
        this.name = name;
        this.uploadDate = uploadDate;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
