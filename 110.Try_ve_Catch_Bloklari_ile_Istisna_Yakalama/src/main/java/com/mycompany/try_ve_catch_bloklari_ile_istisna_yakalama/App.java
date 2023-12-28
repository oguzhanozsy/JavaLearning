/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.try_ve_catch_bloklari_ile_istisna_yakalama;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {

        /*
        KONU ANLATIMI:
        -->Kodlaması:
            
            try{
                //Exception Oluşturabilecek Kodlar...
            }
        
            catch(Exception_Türü e){
                // Exception Durumunda yapılacak işlemler...
            }
        
        -->try içine birden fazla hata yazabiliriz bunları ayrı ayrı catchlerde yakalayabiliriz(ama bunu yaparken en özel olan hatayı ilk başta yaz.
        Yani özelden genele doğru yaz) veya o hataların ortak olan üst sınıflarını yakalıyarak tek catch bloğunda yazdırabiliriz...
        */
        
        // int a = 30 / 0; // Unchecked Exception...
        
        //int[] a = {1,2,3,4,5}; 
        //System.out.println(a[6]);
        
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        try{
            int a = 30 / 0;
        }
        catch(ArithmeticException e){ // buraya sadece Exception da yazabilirdik çünkü Exception ArithmeticException'ın üst sınıfıdır...
            
            System.out.println("Bir Sayi Sifira Bolunemez...");
        }
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         
        try{
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){ // buraya sadece Exception da yazabilirdik çünkü Exception ArrayIndexOutOfBoundsException'ın üst sınıfıdır...
            
           e.printStackTrace(); // hata mesajı yazdırır...
        }
        
        System.out.println("Burasi Calisiyor...");
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        try{ 
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
            
            int b = 30 / 0;
        }
        catch(Exception e){ // üst sınıf kullanarak tek bir catch bloğunda birden fazla hata ile ilgili mesaj yazdırabildik...
            
            System.out.println("Bir hata oluştu...");
            e.printStackTrace();
        }
        
        System.out.println("Burasi Calisiyor...");
        

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        try{ // burda ilk exception'ı bulup, hangi catch'e uyuyorsa onu yakalayıp onu ekrana yazdırır sonra hepsinden çıkıp diğer kod satırlarına geçer...
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
            
            int b = 30 / 0;
        }
        catch(ArithmeticException e){
            
            System.out.println("Bir Sayi 0'a Bolunemez...");
        }
        catch(ArrayIndexOutOfBoundsException e){
            
            System.out.println("Arrayin boyunu astiniz...");
            
        }
        catch(Exception e){ // üst sınıf kullanarak tek bir catch bloğunda birden fazla hata ile ilgili mesaj yazdırabildik...
            
            System.out.println("Bir hata oluştu...");
            e.printStackTrace();
        }
        
        System.out.println("Burasi Calisiyor...");
    }
}
