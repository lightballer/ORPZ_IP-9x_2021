package com.company;

public class Service implements ServiceInterface{
    public String getInfo(String string) {
        System.out.println("Info returned from Service");
        return string;
    }
}
