package com.company;

public class Main {

    public static void main(String[] args) {
        char kelime = 'E';
        switch (kelime){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalin sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        }



    }
}
