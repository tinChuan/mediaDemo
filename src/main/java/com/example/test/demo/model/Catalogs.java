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
public class Catalogs {
     @JsonProperty("Items")
    List<Catalog> items;
      @JsonProperty("ItemsType")
    String itemsType;
    public Catalogs(){
        
    }

    public Catalogs(List<Catalog> items, String itemsType) {
        this.items = items;
        this.itemsType = itemsType;
    }

    public List<Catalog> getItems() {
        return items;
    }

    public String getItemsType() {
        return itemsType;
    }

    public void setItems(List<Catalog> items) {
        this.items = items;
    }

    public void setItemsType(String itemsType) {
        this.itemsType = itemsType;
    }

    
    
}
