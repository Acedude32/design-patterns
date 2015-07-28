package com.smulsky.patterns.adapter2;

public class TranslateAdapter extends EnToRuTranslator {
    private final SuperMegaTranslator adaptee = new SuperMegaTranslator();

    @Override
    public String translate(String str) {
        String lang = detectLang(str);
        if (lang.equals("en")) {
            return super.translate(str);
        } else {
            return adaptee.doMegaTranslate(str);
        }
    }

    private String detectLang(String str) {
        if (str.contains("en")) {
            return "en";
        } else if (str.contains("cn")) {
            return "cn";
        } else if (str.contains("fr")) {
            return "fr";
        }
        return null;
    }
}
