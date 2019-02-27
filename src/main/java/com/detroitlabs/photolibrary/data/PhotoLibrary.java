package com.detroitlabs.photolibrary.data;

import com.detroitlabs.photolibrary.models.Photo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PhotoLibrary {

    private static final List<Photo> PHOTOS = Arrays.asList(
            new Photo("first", LocalDate.of(2019, 2, 27), "firstTag" ),
            new Photo("second", LocalDate.of(2019, 3, 27), "secondTag"),
            new Photo("third", LocalDate.of(2019, 4, 28), "thirdTag"),
            new Photo("fourth", LocalDate.of(2019, 5, 29), "fourthTag")
    );

    public static List<Photo> getPhotos() {
        return PHOTOS;
    }

    public List<Photo> searchByTag(String tagName){

        List<Photo> photosContainingSearchedTag = new ArrayList<>();

        for(Photo photo: PHOTOS){
            if(photo.getTags().contains(tagName)){
                photosContainingSearchedTag.add(photo);
            }
        }
        return photosContainingSearchedTag;
    }

    public List<Photo> getPhotosInDateOrder(){
        List<Photo> photosToSort = getPhotos();
        Collections.sort(photosToSort);
        return photosToSort;
    }

    public List<Photo> getPhotosAlphabetically(){

        List<Photo> photosToSort = getPhotos();
        Collections.sort(photosToSort);
        return photosToSort;
    }

}
