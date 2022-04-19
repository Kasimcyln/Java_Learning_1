package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 220;
        int number2 = 284;
        int toplam = 0;
        int toplam2 = 0;

        for(int i = 1; i<number; i++){
            if(number % i == 0){
                toplam = toplam +i;
            }
        }
        for (int i = 1; i<number2; i++){
            if(number2 % i == 0){
                toplam2 = toplam2 + i;
            }
        }
        if (number == toplam2 && number2 == toplam){
            System.out.println(number +" ve " + number2 + " Arkadas Sayilardir");
        }
        else{
            System.out.println(number +" ve " + number2 + " Arkadas Sayi Degillerdir");
        }

    }
}
