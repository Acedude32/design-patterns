package com.smulsky.patterns.adapter2;

public class SuperMegaTranslator {
    public String doMegaTranslate(String str){
        if (str.contains("cn")) {
            return "translated from cn to ru";
        } else if(str.contains("fr")){
            return "translated from fr to ru";
        }
        return "can not translate";
    }
}
