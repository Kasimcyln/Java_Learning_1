package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    toplama(2,3);
    cıkarma(3,2);
    carpma(3,2);
    }
    public static void toplama(int a,int b){
        int sonuc = a+b;
        System.out.println(a + " + " + b + " = " + sonuc);
    }
    public static void cıkarma(int a,int b){
        int sonuc = a - b;
        System.out.println(a + " - " + b + " = " + sonuc);
    }
    public static void carpma(int a, int b){
        int sonuc  = a*b;
        System.out.println(a + " * " + b + " = " + sonuc);
    }

}
