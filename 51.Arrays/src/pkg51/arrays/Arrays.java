/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg51.arrays;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Arrays {
    
    public static void arrayi_bastir(int[] e){
        
        for(int i = 0 ; i < e.length ; i++){
            System.out.println((i+1) + ".Sayi:" + e[i]);
        }
    }
    
    public static double ortalama_bul(int[] e){
        
        int toplam = 0;
        
        for(int i = 0 ; i < e.length ; i++){
            toplam += e[i];
        }
        
        return ((double)toplam / e.length);
    }
    
    
    public static void main(String[] args) {
        
        // 1)arraylerin tanımlanması...
        int[] a = new int[10];
        
        // 2)arraylerde atama...
        a[5] = 32;
        a[7] = 90;
        
        int[] b = {30,40,50,60,70};
        
        // 3)arraylerde yazdırma...
        System.out.println(b[2]);
        System.out.println(b[4]);
        
        // 4)arraylerde for döngüsü ile atama ve yazdırma yapma...
        
        int[] c = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            
            a[i] = i * 4 + 2;
            
        }
        
        for(int i = 0 ; i < 5 ; i++){
            
            System.out.println(a[i]);
       
        }
        
        // 5)Kullanıcıdan veri alarak arreylere atama...
       
       System.out.println("Sayi Giriniz:");
       Scanner scanner = new Scanner(System.in);
       
       int[] d = new int[5];
       
       for(int i = 0 ; i < 5 ; i++){
           d[i] = scanner.nextInt();
       }
       
        System.out.print("Girilen Sayilar:");
       for(int i = 0 ; i < 5 ; i++){
            
            System.out.print(d[i] + " ");
       
        }
       
        // 6)Arraylerin Uzunluğu...
        System.out.println();
        int[] e = {1,2,3,4,5,6,7,8,9};
        System.out.println("e dizisinin uzunlugu:" + e.length);
       
        // 7)Arrayleri fonksiyonla kullanma...
        
        arrayi_bastir(e);
        
        
        // 8)Arraylerin Ortalamasını Bulma...
        System.out.println("ORTALAMA:" + ortalama_bul(e));
        
    }
    
}
