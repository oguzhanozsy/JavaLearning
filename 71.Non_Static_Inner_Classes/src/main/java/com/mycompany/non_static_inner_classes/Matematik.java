/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.non_static_inner_classes;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Matematik {
    
    private double PI = Math.PI;
    
    public class Factoriyel{ //Inner Class...
        
        public void faktoriyel(){
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Bir Sayi Giriniz:");
            int sayi = scanner.nextInt();
            
            int fakt = 1;
            for(int i = 2 ;i <= sayi ; i ++){
                
                fakt *= i;
            }
            
            System.out.println("Faktoriyel: " + fakt);
        }
    }
    
    public class Asal{ //Inner class
        
        public boolean asal_mi(int sayi){
            
            int i = 2;
            
            while(i < sayi ){
                
                if(sayi % i == 0){
                    
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    
    public class Alan{
        
        public class DaireAlan{
             public void daire_alan(int yaricap){
            System.out.println("Dairenin Alani: " + ( yaricap * yaricap * PI));
        }
        
        }
    }
}
