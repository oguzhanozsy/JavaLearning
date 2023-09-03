/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.input;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Input {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in); // a değişkeni input alabilecek bi obje haline getirir... 
        
        /*
        System.out.println("Lütfen Yaşınızı Giriniz:");
        int yas = a.nextInt(); // yas değişkenine değer girilmesini sağlar...
        System.out.println("Yaşınız: " + yas);
        */
        
        /*
        System.out.println("Lütfen Sayı Giriniz:");
        double sayi = a.nextDouble();
        System.out.println("Sayı: " + sayi);
        */
        
        /*
        System.out.println("Lütfen Bir Yazı Giriniz:");
        String yazi = a.nextLine();
        System.out.println("Yazı: " + yazi);
        */
        
        /*
        System.out.println("Lütfen Sayi Giriniz:");
        
        if(a.hasNextInt()){
            int sayi = a.nextInt();
            System.out.println("Sayi: " + sayi);
        }
        else{
            System.out.println("Hatali Giris!!!");
        }
        */
        
        //nextint ten sonra nextline kullanırsak araya boş bir nextline değeri atamak gerekiyor ve buna Dummy denir...
        //atamazsak nextline inputunu boş geçiyor...
        
        System.out.println("Yaş Giriniz:");
        int yas = a.nextInt();
        a.nextLine(); //Dummy
        
        System.out.println("İsim Giriniz:");
        String isim = a.nextLine();
        
        System.out.println("Yaş: " + yas);
        System.out.println("İsim " + isim);
        
    }
}
