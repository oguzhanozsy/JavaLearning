/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project1;

/**
 *
 * @author ASUS
 */
public class App {
    
    public static boolean asalMi(int sayi){
        
        for(int i = 2 ; i < sayi ; i++){
            
            if(sayi % i == 0){
                
                return false;
            }
            
        }
        return true;
    }
    

    public static void main(String[] args) {
        
        for(int i = 2 ; i < 1000 ; i++){
            
            if(asalMi(i)){
                
                System.out.println(i);
            }
        }
        
    }
}
