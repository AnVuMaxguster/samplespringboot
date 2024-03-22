package com.example.add;

import org.springframework.stereotype.Service;

@Service
public class AddService {
    public int result (int a, int b){
        return a+b;
    }
}