package com.smulsky.patterns.adapter2;

public class EnToRuTranslator implements Translator {

    @Override
    public String translate(String str) {
        String lang = detectLang(str);
        if ("en".equals(lang)) {
            return "en translated to ru";
        }
        return "can not translate";
    }

    private String detectLang(String str) {
        if (str.contains("en")) {
            return "en";
        }
        return null;
    }
}
