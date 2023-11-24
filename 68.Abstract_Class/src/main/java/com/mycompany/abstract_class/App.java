/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstract_class;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {

        /*
        KONU ANLATIMI:
        ->override edilmesi gerekmeyen methodları veya mutlaka ama mutlaka override edilmesi gereken methodları bi sınıfta biriktirerek alt sınıflarda kullanmayı sağlar...
        ->Interfaceler gibi objeler oluşturamayız ancak referansları alt sınıflara doğrudan referans olabiliyor...
        ->Hem gövdeli hem de gövdesiz methodlar bir arada bulunabiliyor yani hem soyut hemde soyut methodlarımız aynı anda bulunabiliyor...
        ->Normal class a özellik eker gibi abstract class'ına da özellik eklenebilir...
        ->Bir class'ın abstract olduğunu bir tane abstract yani gövdesiz methodun varlığından anlarız...
        */
        
        Sekil sekil;
        sekil = new Kare("Kare2", 6);
        
        sekil.alan_hesapla();
        Kare kare1 = new Kare("Kare1", 5);
        Daire daire1 = new Daire("Daire1", 3);
        
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        kare1.cevre_hesapla();
        
        
    }
    

    }

