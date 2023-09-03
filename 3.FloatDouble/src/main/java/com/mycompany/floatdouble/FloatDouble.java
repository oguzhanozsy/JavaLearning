/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.floatdouble;

/**
 *
 * @author ASUS
 */
public class FloatDouble {

    public static void main(String[] args) {
        
        // double 64 bit - 8 byte...
        // float 32 bit - 4 byte...
        
        // Otomatik Dönüştürme : int --> float --> double
        
        
        /*
        double a = 5.25;
        double b = 4.0;
        double c = 4d; // d işareti double olduğunu gösterir...
        double d = 4.23d;
        
        System.out.println(c);
        */
        
        /*
        float a = (float)5.0; // dönüşüm yapmamızın sebebi 5.0 ı javanın double olarak algılamasındır...
        float b = 5f;
        float c = 5.2f; // f işareti floata dönüştürmek için kullanılır...
        */
        
        /*
        int a = 22 / 7;
        float b = 22f / 7f;
        double c = 22d / 7d;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        */
         
        
        /*
        // otomatik dönüştürme...
        int i = 5;
        double j = i;
        System.out.println(j);
        
        // elle dönüştürme...
        double a = 3.52;
        float b = (float)a;
        */
        
        double sayi1 = 70.25;
        double sayi2 = 60d;
        double sayi3 = 80.2;
        
        float a = 70.25f;
        float b = 60f;
        float c = 80.2f;
        
        System.out.println("Ortalama1: " + (sayi1 + sayi2 + sayi3)/3);
        System.out.println("Ortalama2: " + (a + b + c)/3);
        
    }
}
