package com.example.hcihw5191532.model;

import java.util.Random;

public class Thread {
    public String nameOfThread;
    public String postedBy;
    public Integer numberRow;


    public Thread(String nameOfThread, String postedBy) {
        this.nameOfThread = nameOfThread;
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        this.postedBy = "user"+randomInt+"_new";
    }
}
