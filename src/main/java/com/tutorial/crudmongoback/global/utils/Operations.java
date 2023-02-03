package com.tutorial.crudmongoback.global.utils;

public class Operations {
    public static String trimBreackets(String messages){
        return messages.replaceAll("[\\[\\]]","");
    }
}
