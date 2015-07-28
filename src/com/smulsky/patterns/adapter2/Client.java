package com.smulsky.patterns.adapter2;

public class Client {
    public static void main(String[] args) {
/*
        Translator translator = new EnToRuTranslator();
        System.out.println(translator.translate("en text bla bla"));
        System.out.println(translator.translate("cn text bla bla bla"));
        System.out.println(translator.translate("fr text bla bla bla bla bla"));
*/

        Translator translator = new TranslateAdapter();
        System.out.println(translator.translate("en text bla bla"));
        System.out.println(translator.translate("cn text bla bla bla"));
        System.out.println(translator.translate("fr text bla bla bla bla bla"));

    }
}
