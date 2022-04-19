package com.company;

public class Main {

    public static void main(String[] args) {
        char grade = 'A';
        switch (grade)
        {
            case 'A':
                System.out.println("Mukkemmel : Gectiniz");
                break;
            case 'B':
                System.out.println("Cok Guzel : Gectiniz");
                break;
            case 'C':
                System.out.println("Iyi: Gectiniz");
                break;
            case 'D':
                System.out.println("Fena Degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Malesef : Kaldiniz");
                break;
            default:
                System.out.println("gecersiz not girdiniz");
                break;
        }
    }
}
