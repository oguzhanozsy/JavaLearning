/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project3;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static int cikarma(int a , int b){
        
        return (a - b);
    }
    public static double bolme(int a , int b) {
        
        return ((double)(a / b));
    }
    public static int toplama(int a , int b) {
        
        return (a + b);
    }
    public static int toplama(int a , int b , int c) {
        
        return (a + b + c);
    }
    public static int carpma(int a , int b) {
        
        return (a * b);
    }
    public static int carpma(int a , int b , int c) {
        
        return (a * b * c);
    }
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        String islemler = "1.Toplama İşlemi\n"
                        + "2.Çıkarma İşlemi\n"
                        + "3.Çarpma İşlemi\n"
                        + "4.Bölme İşlemi\n"
                        + "Çıkış İçin q'ya basın.";
        
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        while(true){
            
            System.out.print("İşlem Tipini Seçiniz: ");
            String islem = a.nextLine();
            
            if (islem.equals("q")) {
                
                System.out.println("Programdan Çıkılıyor...");
                break;
                
            }else if(islem.equals("1")){
                
                System.out.print("Kaç Sayı İle İşlem Yapmak İstersiniz(2 veya 3): ");
                int adet = a.nextInt();
                
                
                if(adet == 2){
                    
                    System.out.print("1.Sayiyi Giriniz: ");
                    int x = a.nextInt();
                    System.out.print("2.Sayiyi Giriniz: ");
                    int y = a.nextInt();
                    a.nextLine();
                    System.out.println(x + " + " + y + " = " + toplama(x, y));
                
                }else if(adet == 3){
                    System.out.print("1.Sayiyi Giriniz: ");
                    int x = a.nextInt();
                    System.out.print("2.Sayiyi Giriniz: ");
                    int y = a.nextInt();
                    System.out.print("3.Sayiyi Giriniz: ");
                    int z = a.nextInt();
                    a.nextLine();
                    System.out.println(x + " + " + y + " + " + z +  " = " + toplama(x, y,z));
                }else{
                    
                    System.out.println("Sayi Adeti Hatalı....");
                }
            
            }else if(islem.equals("2")){
                
                System.out.print("1.Sayiyi Giriniz: ");
                int x = a.nextInt();
                System.out.print("2.Sayiyi Giriniz: ");
                int y = a.nextInt();
                a.nextLine();
                
                System.out.println(x + " - " + y + " = " + cikarma(x, y));
                
              
            
            }else if(islem.equals("3")){
                
                System.out.print("Kaç Sayı İle İşlem Yapmak İstersiniz(2 veya 3): ");
                int adet = a.nextInt();
                
                if(adet == 2){
                    
                    System.out.print("1.Sayiyi Giriniz: ");
                    int x = a.nextInt();
                    System.out.print("2.Sayiyi Giriniz: ");
                    int y = a.nextInt();
                    a.nextLine();
                    
                    System.out.println(x + " * " + y + " = " + carpma(x, y));
                
                }else if(adet == 3){
                    System.out.print("1.Sayiyi Giriniz: ");
                    int x = a.nextInt();
                    System.out.print("2.Sayiyi Giriniz: ");
                    int y = a.nextInt();
                    System.out.print("3.Sayiyi Giriniz: ");
                    int z = a.nextInt();
                    a.nextLine();
                    
                    System.out.println(x + " * " + y + " * " + z +  " = " + carpma(x, y,z));
                }else{
                    
                    System.out.println("Sayi Adeti Hatalı....");
                }
            
            }else if(islem.equals("4")){
                
                System.out.print("1.Sayiyi Giriniz: ");
                int x = a.nextInt();
                System.out.print("2.Sayiyi Giriniz: ");
                int y = a.nextInt();
                a.nextLine();
                
                System.out.println(x + " / " + y + " = " + bolme(x, y));
                 
            }else{
                
                System.out.println("HATALI SEÇİM YAPTINIZ...");
            }
            
            
            
        }
        
    }
}
