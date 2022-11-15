/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author cwu
 */
public class Details {
    @JsonProperty("Name")
    String name;
    
    @JsonProperty("ShortDesc")
    String shortDesc;
    
    @JsonProperty("Desc")
    String desc;
    
    @JsonProperty("Images")
    List<Image> images;
    
     @JsonProperty("Genres")
    List<Genre> genres;

     public Details(){
        
    }
    public Details(String name, String shortDesc, String desc, List<Image> images, List<Genre> genres) {
        this.name = name;
        this.shortDesc = shortDesc;
        this.desc = desc;
        this.images = images;
        this.genres = genres;
    }
    
    public String getName() {
        return name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getDesc() {
        return desc;
    }

    public List<Image> getImages() {
        return images;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
     
     
    
    
   




}
