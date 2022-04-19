package com.company;

public class Main {

    public static void main(String[] args) {

        int number = -4;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                isPrime = false;

            }
        }
        if (number == 1) {
            System.out.println("sayi asal degil");
        }
        else if (number < 1){
            System.out.println("gecersiz sayi");
        }
        else if (isPrime && number == 0){
            System.out.println("sayi asaldir");
        }
        else{
            System.out.println("sayi asal degil");
        }
    }
}
