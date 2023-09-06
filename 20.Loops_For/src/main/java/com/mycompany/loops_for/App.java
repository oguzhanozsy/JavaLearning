/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loops_for;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        /*
        int i;
        
        for(i = 0; i < 5; i++){
            
            System.out.println("i = " + i);
            
        }
        */
        
        /*
               
        for(int i = 0; i < 5; i++){
            
            System.out.println("i = " + i);

        }
        */
        
        /*
        for(int i = 10; i >= 0; i--){
            
            System.out.println("i = " + i);
            
        }
        */
        
        /*
        int i = 0;
        
        for(; i < 5; i++){
            
            System.out.println("Java Öğreniyorum...");
            
        }
        */
        
        /*
        int i = 0;
        int j = 10;
        
        for(; i < 10 && j > 0; i++ , j--){
            
            System.out.println("*** i = " + i + " *** j = " + j + " ***");
            
        }
        */
        
        /*
        int i;
        for(i = 2 ; i < 100 ; i *=2){
        
        System.out.println("i = " + i);
       
        }
        */
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Bir Sayi Giriniz:");
        
        int faktoriyel = 1;
        int sayi = a.nextInt();
        
        for(int i = 1; i <= sayi; i++){
        
            faktoriyel *= i;
            
        }
        
        System.out.println("Faktoriyel=" + faktoriyel);
    }
}
