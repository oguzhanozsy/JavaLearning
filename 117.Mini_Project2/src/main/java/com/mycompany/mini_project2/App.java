/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class CarpmaException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Iki sayi da cok buyuk.Lutfen daha kucuk sayilar girin...");
    }
    
    
    
}
public class App {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("********************");
        System.out.println("1. Toplama İşlemi\n"
                           + "2.Çıkartma İşlemi\n"
                           + "3.Çarpma İşlemi\n"
                           + "4.Bölme İşlemi");
        System.out.println("********************");
        System.out.print("İşlemi Seçiniz:");
        String islem = a.nextLine();
        
        int x;
        int y;
        
        try{
        
        switch (islem) {
            case "1":
                System.out.print("Birinci Sayi:");
                x = a.nextInt();
                System.out.print("İkinci Sayi:");
                y = a.nextInt();
                System.out.println("Toplam: " + (x + y));
                break;
            case "2":
                System.out.print("Birinci Sayi:");
                x = a.nextInt();
                System.out.print("İkinci Sayi:");
                y = a.nextInt();
                System.out.println("Fark: " + (x - y));
                break;
            case "3":
                System.out.print("Birinci Sayi:");
                x = a.nextInt();
                System.out.print("İkinci Sayi:");
                y = a.nextInt();
                
                if(x > 10000 && y > 10000){
                    
                    throw new CarpmaException();
                }
                
                System.out.println("Çarpım:" + (x * y));
                break;
            case "4":
                System.out.print("Birinci Sayi:");
                x = a.nextInt();
                System.out.print("İkinci Sayi:");
                y = a.nextInt();
                System.out.println("Bölüm: " + ((double)x / y));
                break;
            default:
                System.out.println("Geçersiz İşlem Tipi...");
            }
        }
        catch(ArithmeticException e){
            
            System.out.println("Bir Sayi 0'a Bolunemez...");
            
        }catch(InputMismatchException e){
            System.out.println("Lutfen Inputları Dogru Formatta Girin...");
        } catch (CarpmaException ex) {
             ex.printStackTrace();
        }
    }
}
