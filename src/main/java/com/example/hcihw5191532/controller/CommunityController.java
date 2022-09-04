package com.example.hcihw5191532.controller;

import com.example.hcihw5191532.model.Thread;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommunityController {

    public List<Thread> threadList = new ArrayList<>();
    public Integer indexOf;

    @GetMapping("/community")
    public String getCommunityPage(Model model) {
        model.addAttribute("threadList", threadList);
        model.addAttribute("indexOf", indexOf);
        return "community";
    }

    @GetMapping("/addThread")
    public String getAddThreadPage() {
        return "addThread";
    }

    @PostMapping("/addThread")
    public String createThread(@RequestParam String nameOfThread,
                               @RequestParam(required = false) String postedBy) {
        Thread tmp = null;
        tmp = new Thread(nameOfThread, postedBy);
        threadList.add(tmp);
        indexOf = threadList.indexOf(tmp);
        threadList.get(indexOf).numberRow = indexOf+2;
        return "redirect:/community";
    }
}
