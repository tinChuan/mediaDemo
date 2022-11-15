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
public class Catalog {
    @JsonProperty("Id")
    String id;
    @JsonProperty("Name")
    String name;

    public Catalog(){
        
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Catalog(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

   
}
