package com.example.politicians;

import org.springframework.stereotype.Component;

@Component
public class Biden implements Politicians{

    public String doPolitics() {
        return "Biden";
    }


}
