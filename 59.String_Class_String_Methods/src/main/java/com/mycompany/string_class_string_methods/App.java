/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.string_class_string_methods;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        String a = "Mustafa";
        String b = new String("Mustafa");
        
        System.out.println(b);
        System.out.println("Harf Sayisi:" + b.length());
        
        System.out.println("0.index" + b.charAt(0)); // istenilen harfi alır...
        System.out.println("2.index" + b.charAt(2));
        System.out.println("Son Eleman:" + b.charAt(b.length()-1));

        
        for(int i = 0 ; i < b.length() ; i++){
            
            System.out.println(b.charAt(i));
        }
        
        System.out.println(b.startsWith("Mu")); // String "Mu" ile mi başlıyor...
        System.out.println(b.endsWith("CO")); // String "CO" ile mi bitiyor...
        
        System.out.println(b.indexOf("a")); // a harfinin konumunu söyler.Eğer olmayan bişey varsa -1 döndürür...
        System.out.println(b.lastIndexOf("a")); // a harfine sondan aramaya başlar ama konumunu başa göre söyler...
        
        System.out.println(b.toLowerCase()); // tüm harfleri küçük yazar...
        System.out.println(b.toUpperCase()); // tüm harfleri büyük yazar...
        
        String a1 = "1923";
        int b1 = Integer.parseInt(a1); // stringleri int'e çevirir...
        System.out.println(b1);
        
        int b2 = 1923;
        String a2 = String.valueOf(b2); // int'leri string'e çevirir...
        System.out.println(a2);
        
        
        //Böyle tanımlarsak aynı stringler aynı yeri gösterir...
        String s1 = "Mustafa";
        String s2 = "Mustafa";
        
        if(s1 == s2){
            System.out.println("Esitler...");
        }else {
            System.out.println("Esit Degiller...");
        }
        
        // Böyle Tanımlarsak Aynı Stringler Farklı Yeri Gösterir...
        
        String c1 = new String("Ali");
        String c2 = new String("Ali");
        
        if(s1 == s2){
            System.out.println("Esitler...");
        }else {
            System.out.println("Esit Degiller...");
        }
        
        
    }
}
