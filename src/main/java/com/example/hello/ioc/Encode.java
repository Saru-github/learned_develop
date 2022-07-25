package com.example.hello.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Encode {

    private IEncoder iEncoder;

    public Encode(@Qualifier("urlEncoder") IEncoder iEncoder){
        this.iEncoder  = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }


    public String encode(String message){
        return iEncoder.encode(message);
    }

}
