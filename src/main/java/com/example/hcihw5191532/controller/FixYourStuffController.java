package com.example.hcihw5191532.controller;

import com.example.hcihw5191532.model.ContentIphone6;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FixYourStuffController {

    List<ContentIphone6> contentIphone6List = new ArrayList<>();

    @GetMapping("/fixYourStuff")
    public String showFixYourStuffPage(Model model,
            @RequestParam (required = false) String searchByKeyword){
        if(searchByKeyword==null || searchByKeyword.isEmpty()){
            contentIphone6List = new ArrayList<>();
            model.addAttribute("contentList", contentIphone6List);
        } else {
            ContentIphone6 content1 = new ContentIphone6("iphone6.png", "IPhone 6 Battery Replacement");
            ContentIphone6 content2 = new ContentIphone6("iphone6.png", "IPhone 6 Home Button Replacement");
            ContentIphone6 content3 = new ContentIphone6("iphone6.png", "IPhone 6 Screen Replacement");
            ContentIphone6 content4 = new ContentIphone6("iphone6.png", "How to Force Restart IPhone 6");
            contentIphone6List.add(content1); contentIphone6List.add(content2);
            contentIphone6List.add(content3); contentIphone6List.add(content4);
            model.addAttribute("contentList", contentIphone6List);
            model.addAttribute("searchByKeyword", searchByKeyword);
        }
        return "fixyourstuff";
    }

    @GetMapping("/fixYourIphone6")
    public String fixYourIphone6() {
        return "fixYourIphone6";
    }
}
