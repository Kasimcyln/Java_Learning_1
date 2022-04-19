package com.company;

public class Main {

    public static void main(String[] args) {
        //bu biraz uzun oldugu için pek kullanılmaz
        String ogrenci1 = "Kasim";
        String ogrenci2 = "Salih";
        String ogrenci3 = "Oktay";
        String ogrenci4 = "Kitik";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------");
        // yaygın olarak bu kullanılır kolay ve sade
        String[] ogrenciler = new String[4] ;
        ogrenciler[0] = "Kasim";
        ogrenciler[1] = "Salih";
        ogrenciler[2] = "Oktay";
        ogrenciler[3] = "Kitik";

        // bu kod blogundakileri asagıdaki gibi de yapabiliriz asagıdaki daha kolay

        /* for (int i = 0;i<ogrenciler.length; i++)
        {
            System.out.println(ogrenciler[i]);
        }*/

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
