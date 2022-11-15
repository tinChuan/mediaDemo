/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test.demo.model;

import java.util.List;

/**
 *
 * @author cwu
 */
public class MediaInfo {
    List<Details> list;

    public MediaInfo(){
        
    }

    public List<Details> getList() {
        return list;
    }
    public MediaInfo(List<Details> list) {
        this.list = list;
    }

    public void setList(List<Details> list) {
        this.list = list;
    }
    
}
