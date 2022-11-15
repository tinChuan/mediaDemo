/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author cwu
 */
public class Image {
    @JsonProperty("Type")
    String type;
    @JsonProperty("Url")
    String url;
    @JsonProperty("Width")
    String width;
    @JsonProperty("Height")
    String height;
    public Image(){
        
    }
    public Image(String type, String url, String width, String height) {
        this.type = type;
        this.url = url;
        this.width = width;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    
}
