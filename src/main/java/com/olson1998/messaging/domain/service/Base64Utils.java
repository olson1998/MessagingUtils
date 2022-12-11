package com.olson1998.messaging.domain.service;

import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Base64Utils {

    public static String encode(String text){
        if(text != null){
            var textBytes = text.getBytes(UTF_8);
            return Base64.getEncoder().encodeToString(textBytes);
        }else {
            return null;
        }
    }

    public static String decode(String text){
        if(text != null){
            var encodedTextBytes =  Base64.getDecoder().decode(text);
            return new String(encodedTextBytes);
        }else {
            return null;
        }
    }

    private Base64Utils() {
    }
}
