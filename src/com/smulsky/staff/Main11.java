package com.smulsky.staff;

public class Main11 {
    public static void main(String[] args) {
        System.out.println("a" == "a");

        String a = new String("a");

        System.out.println(a == "a");

        a = a.intern();
        System.out.println(a == "a");
    }
}
