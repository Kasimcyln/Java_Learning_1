package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String mesaj = "       Yazilimda En iyi Olacagim.   ";
        System.out.println(mesaj);

        System.out.println("eleman sayisi :"+ mesaj.length()); //karakaterlerin toplam sayısını bulur.
        System.out.println("5. eleman :" +mesaj.charAt(4)); //girdiğimiz indexteki elemanın hangisi oldugunu bulur.
        System.out.println(mesaj.concat(" basaracam")); // metnin sonuna eklemek istediğimiz stringi ekler.
        System.out.println(mesaj.startsWith("y")); // metin girdiğimiz karakterle başlıyorsa true döndürür girdiğimiz karakterle başlamıyorsa false döndürür.
        System.out.println(mesaj.endsWith(".")); //metin girdiğimiz karaterle bitiyorsa true döndürür girdiğimiz karakterle bitmiyorsa false döndürür.
        char[] karakterler = new char[7]; // yeni bir string oluşturduk.
        mesaj.getChars(0,7,karakterler,0); // 0. index ile 7. index arasındaki karakterleri yeni stringe atar.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("i")); // girilen karakterin baştan aramaya başlayarak kaçıncı indexte olduğunu bulur.
        System.out.println(mesaj.lastIndexOf("g")); // girilen karakterin sondan aramaya başlayarak kaçıcı indexte olduğunu bulur.
        System.out.println("-------------------");
        String yenimesaj = mesaj.replace(' ', '-'); // metnin içinde değiştirmek istediğimiz karakeri yeni ekleyeceğimiz karaketerle değiştirir.
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(10)); // metni kaçıncı indexten başlamsını istiyorsak o indexten itibaren alır.
        System.out.println(mesaj.substring(10,16)); //yukardakiyle aynı fark bitişi de belirliyoruz.
        System.out.println("------------");
        for(String kelime : mesaj.split(" ")){ // metni hangi karakterden itibarren ayrılmasını istiyosak onu belirleyip parça parça haline getirir.
            System.out.println(kelime);
        }
        System.out.println("--------------");
        System.out.println(mesaj.toLowerCase()); // metnin içindeki bütün karakterleri küçük harfe çevirir.
        System.out.println(mesaj.toUpperCase()); // metnin içindeki bütün karakterleri büyük harfe çevirir.
        System.out.println(mesaj.trim()); // metnin başından ve sonundan istenilmeyen karakterleri atar.

    }
}
