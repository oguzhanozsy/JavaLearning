/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static int ebobBulma(int sayi1 , int sayi2){
        
        int ebob = 1;
        
        for(int i = 1 ; i <= sayi1 && i <= sayi2 ; i++){
            
            if((sayi1 % i == 0) && (sayi2 % i == 0)){
                
                ebob = i;
            }
        }
        return ebob;
    }
    
    
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Birinci Sayiyi Giriniz: ");
        int x = a.nextInt();
        
        System.err.print("İkinci Sayiyi Giriniz: ");
        int y = a.nextInt();
        
        System.out.println("EBOB = " + ebobBulma(x, y));
        
    }
}
