package com.detroitlabs.photolibrary.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo implements Comparable<Photo> {

    private String name;
    private LocalDate uploadDate;
    private ArrayList<String> tags;

    public Photo(String name, LocalDate uploadDate, String tag) {
        this.name = name;
        this.uploadDate = uploadDate;
        this.tags = new ArrayList<>();
        this.tags.add(tag);
    }

    @Override
    public int compareTo(Photo photo2){
        return this.getName().compareTo(photo2.getName());
    }


    public void addTag(String tagToAdd){
        this.tags.add(tagToAdd);
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
