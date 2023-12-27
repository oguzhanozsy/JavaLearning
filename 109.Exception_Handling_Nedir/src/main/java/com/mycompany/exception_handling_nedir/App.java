/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exception_handling_nedir;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        /*
        KONU ANLATIMI:
        EXCEPTION VE EXCEPTION HANDLING NEDİR?
        
        -->Exception(İstisna),programlarımızın çalışma zamanında(runtime) normal akışını bozan olaylardır...

        -->Exception Handling(İstisna Yakalama) ise bu exceptionların yakalanması ve programlarımızın daha güvenli çalışması için
        geliştirilmiş bir mekanizmadır.

        -->Exceptionlara örnek olarak Input Output hataları, Veritabanı bağlantı hatası ve Aritmetik hatalar verilebilir...
        
        -->ÖRNEK:
            *Kod Parçacığı 1
            *Kod Parçacığı 2
            *Kod Parçacığı 3 //Exception Oluştu
            *Kod Parçacığı 4
            *Kod Parçacığı 5
            3.Kod Parçacığında oluşabilecek herhangi bir exception sonucunda java çalışmasını durdurur ve 4. ile 5.kod parçacığını çalıştırmaz.
            Ancak Exception Handling mekanizması ile bu exception'ı yakalayıp programımızı daha güvenli yazabiliriz...
            
        -->EXCEPTION TÜRLERİ:
            -Checked Exception: Runtime Exceptionlardan türemeyen her class "Checked Exception" kapsamına girer ve Java kodların exception fırlatabileceğini
        öngörür.Bu hataları yakalamazsak Java bize bu hataları yakalamamızı söyler.Örnek:IOException,SqlException...
           
            -Unchecked Exception: Runtime Exceptionlardan türeyen her class "Unchecked" kapsamına girer ve programı çalıştırmadan önce kontrol edilemezler.
        Yani Java bu exception'ı öngöremez.Hataları yakalama programcının sorumluluğundadır.
        Örnek:ArithmeticException, NullPointerException
        
            -Error: Geri dönülmez ve tamir edilemeyen hatalardır.(biz bunları yakalayamayız)
        Örnek:OutOfMemoryError
        
        -->EXCEPTION ÖRNEKLERİ:
        ------------------------------------------
          -NullPointerException
            String s = null;
            System.out.println(s.length()); 
        ------------------------------------------
          -ArithmeticException
            int b = 12/0;
        ------------------------------------------
          -NumberFormatException
            String s = "a12";
            int i = Integer.parselnt(s);
        
        
        
        */
    }
}
