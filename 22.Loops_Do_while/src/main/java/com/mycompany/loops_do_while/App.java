/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loops_do_while;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        /*
        int i = 0;
        
        do{
            
            System.out.println("i = " + i);
            i++;
            
        }while(i < 5);
        */
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Bir Sayi Giriniz:");
        
        int sayi = a.nextInt();
        int toplam = 0;
        
        do{
            
            toplam += sayi % 10;
            sayi /= 10;
            
        }while(sayi > 0);
        
        System.out.println("Rakamlar Toplamı= " + toplam);
        
    }
}
