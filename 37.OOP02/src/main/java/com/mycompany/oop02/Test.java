/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop02;

/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) {

       /*
            Encapsulation Yöntemi:
            -->Classlarımızdaki private olan özelliklerimize erişmek için bu yöntemi kullanırız. Bunu yapmak için
            classımızın içinde public olacak şekilde metodlar oluştururuz ve onlar aracılığı ile private özelliklerimize ulaşırız.
       */
       
       Araba araba1 = new Araba();
       
       araba1.setModel("Caddy"); // değer atama.
       
       System.out.println("Arabanın Modeli: " + araba1.getModel()); // atanılan değeri yazdırma.
       
       araba1.setKapilar(-4);
       
       /*
          HATA ÖRNEKLERİ:
          1)    Araba araba2;   //burdaki referansı objeye atamadığımız için java hata verir.
                araba2.setKapilar(10);
       
       
          2)// NullPointerException hatası:(bir referansa obje atamadan ona erişmeye çalışınca ortaya çıkan bir hatadır...)
            // Android ile ilgili çalışırken sıkça karşılaşılan bir hatadır DİKKAT!!!
               
                Araba araba3 = null ; 
                araba3.setModel("Caddy");
       */
       
       
       
    }
}
