package com.detroitlabs.photolibrary.data;

import com.detroitlabs.photolibrary.models.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class PhotoLibrary {

    private static final List<Photo> PHOTOS = Arrays.asList(
            new Photo("overlook", LocalDate.of(2019, 2, 27), "scenic" ),
            new Photo("presentmountain", LocalDate.of(2019, 3, 27), "hiking"),
            new Photo("doublecpeak", LocalDate.of(2019, 4, 28), "peak"),
            new Photo("cliff", LocalDate.of(2019, 5, 29), "scenic"),
            new Photo("bridge", LocalDate.of(2019, 2, 27), "hiking" )
    );

    public static List<Photo> getPhotos() {
        return PHOTOS;
    }

    public List<Photo> getAllPhotos(){
        return PHOTOS;
    }


    public List<Photo> searchByTag(String tagName){

        List<Photo> photosContainingSearchedTag = new ArrayList<>();

        for(int i = 0; i < PHOTOS.size(); i++){
            if(PHOTOS.get(i).getTags().contains(tagName)){
                photosContainingSearchedTag.add(PHOTOS.get(i));
            }
        }

        return photosContainingSearchedTag;
    }

    public List<Photo> getPhotosInDateOrder(){
        List<Photo> photosToSort = new ArrayList<>();
        photosToSort.addAll(getPhotos());
        Collections.sort(photosToSort, new Comparator<Photo>() {
            @Override
            public int compare(Photo photo1UploadDate, Photo photoTwoUploadDate) {
                return photo1UploadDate.getUploadDate().compareTo(photoTwoUploadDate.getUploadDate());
            }
        });
        return photosToSort;
    }

    public List<Photo> getPhotosAlphabetically(){

        List<Photo> photosToSort = new ArrayList<>();
        photosToSort.addAll(getPhotos());
        Collections.sort(photosToSort);
        return photosToSort;
    }

}
