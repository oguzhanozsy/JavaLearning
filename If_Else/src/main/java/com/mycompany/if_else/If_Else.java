/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.if_else;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class If_Else {

    public static void main(String[] args) {
        
        /*
        if(koşul){
            koşul sağlanınca bu blok çalışır...
        
        }
        else {
            Bu bloğun üsütndeki herhangi bir koşul sağlanmadığında bu blok çalışır...
        }
        */
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Bir Sayi Giriniz:");
        
        int sayi = a.nextInt();
        
        if(sayi < 0){
            
            System.out.println("Negatif");
            
        } else {
            System.out.println("Pozitif veya 0");
        }
        
        
        //EXAMPLE
        System.out.print("Ders Notunu Giriniz:");
        int not = a.nextInt();
        
        if(not >= 85){
            
            System.out.println("AA");
            
        }else if(not >= 75){
            
            System.out.println("BB");
                 
        }else if(not >= 65){
            
            System.out.println("CC");
            
        }else if(not >= 55){
            
            System.out.println("DD");
            
        }else{
            
            System.out.println("Dersten Kaldınız...");
            
        }
    }
}
