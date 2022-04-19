package com.company;

public class Main {

    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "bursa";
        sehirler[0][2] = "bilecik";
        sehirler[1][0] = "ankara";
        sehirler[1][1] = "konya";
        sehirler[1][2] = "kayseri";
        sehirler[2][0] = "sanliurfa";
        sehirler[2][1] = "gaziantep";
        sehirler[2][2] = "diyarbakir";

        for(int i = 0; i<3; i++){
            System.out.println("---------------------------");
            for(int j = 0; j<3; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
