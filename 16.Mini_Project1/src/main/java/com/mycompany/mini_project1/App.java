/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("1.Sayi: ");
        int sayi1 = a.nextInt();
        
        System.out.print("2.Sayi: ");
        int sayi2 = a.nextInt();
        
        System.out.print("3.Sayi: ");
        int sayi3 = a.nextInt();
        
        int max = -1;
        
        if(sayi1 >= sayi2 && sayi1 >= sayi3){
            
            max = sayi1;

        }else if(sayi2 >= sayi1 && sayi2 >= sayi3){
            
            max = sayi2;
            
        }else{
            
            max = sayi3;
            
        }
            System.out.print("MAXİMUM: " + max);
        
    }
}
