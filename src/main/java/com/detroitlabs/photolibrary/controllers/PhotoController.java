package com.detroitlabs.photolibrary.controllers;

import com.detroitlabs.photolibrary.data.PhotoLibrary;
import com.detroitlabs.photolibrary.models.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PhotoController {

@Autowired
private PhotoLibrary photoLibrary;

    @RequestMapping("/")
    public String displayHome(ModelMap modelMap){
        modelMap.put("allPhotos", photoLibrary.getAllPhotos());
        return "home";
    }

    @RequestMapping("/alphabetically")
    public String displayAlphabetically(ModelMap modelMap){
        modelMap.put("allPhotos", photoLibrary.getPhotosAlphabetically());
        return "alphabetically";
    }

    @RequestMapping("/date")
    public String displayByDate(ModelMap modelMap){
        modelMap.put("allPhotos", photoLibrary.getPhotosInDateOrder());
        return "date";
    }

    @RequestMapping("/search")
    public String searchByTag(@RequestParam(name = "searchValue") String searchValue, ModelMap modelMap){
        List<Photo> searchResults = photoLibrary.searchByTag(searchValue);
        modelMap.put("searchResults", searchResults);
        return "search";
    }

}
