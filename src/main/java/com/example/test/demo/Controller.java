/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test.demo;

import com.example.test.demo.model.Catalog;
import com.example.test.demo.model.Catalogs;
import com.example.test.demo.model.Details;
import com.example.test.demo.model.Image;
import com.example.test.demo.model.MediaInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author cwu
 */
@RestController
@RequestMapping("/medias")
public class Controller {
    
    @Value("${demo.cap1}")
    private String MEDIA_CATALOG ;
    @Value("${demo.cap2}")
    private String MEDIA_DETAILS ;
    @Autowired
    private RestTemplate restTemplate;
    
    //end point 1  // http://localhost:8081/medias?top=3
    @RequestMapping("")
    public Catalogs getList(@RequestParam("top") String top){
        Catalogs catalogs=null;
        for(Character c:top.toCharArray()){
            if(!Character.isDigit(c))return null;//go to error page.
        }
        int n = Integer.parseInt(top);
        if(n<=0||n>10){
            //go to error page.
            return null;
        }
        try{
            catalogs = restTemplate.getForObject(MEDIA_CATALOG+top, Catalogs.class);
        }catch(Exception e){
            e.printStackTrace();
            //go to erro page
        }
        return catalogs;
    }
    //end point 2 //http://localhost:8081/medias/32254
    @RequestMapping("/{mediaID}")
    public Details getMediaDetails(@PathVariable("mediaID") String mediaID,Model model){
        Details d = null;
        // should vaild the input mediaID at here.based on the data type and format in cap2 side
        try{
         d = restTemplate.getForObject(MEDIA_DETAILS+mediaID,Details.class);
         model.addAttribute("details", d);//used for front end
        }catch(Exception e){
            e.printStackTrace();//print into log file
            //go to error page
        }
         return d;
    }
    
    //end point 3      //http://localhost:8081/medias/details/32254?imageType=poster
    @RequestMapping("/details/{mediasNum}")
    public Details getListWithDetails(@PathVariable("mediasNum") String mediasNum,@RequestParam("imageType") String imageType,Model model){
        Details d = null;
        // should vaild the input mediasNum and imageType at here.based on the data type and format in cap2 side 
        try{
            d = restTemplate.getForObject(MEDIA_DETAILS+mediasNum,Details.class);
            List<Image> updated = new ArrayList<>();
            List<Image> Images = d.getImages();
            for(Image image:Images){
                if(image.getType().equals(imageType))
                   updated.add(image);
            }
            d.setImages(updated);
            model.addAttribute("details", d);//for front end
        }catch(Exception e){
                e.printStackTrace();// print into log file
                //go to error page
            }
        return d;
        
    }
}
