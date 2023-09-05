/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Vize Notunuzu Giriniz: ");
        int vize1 = a.nextInt();
        
        System.out.print("Vize2 Notunuzu Giriniz: ");
        int vize2 = a.nextInt();
        
        System.out.print("Final Notunuzu Giriniz: ");
        int finall = a.nextInt();
        
        double not = (vize1 * 0.3) + (vize2 * 0.3) + (finall * 0.4);
        
        if(not >= 90){
            System.out.println("AA ile geçtiniz...");
        }else if(not >= 85){
            System.out.println("BA ile geçtiniz...");
        }else if(not >= 80){
            System.out.println("BB ile geçtiniz...");
        }else if(not >= 75){
            System.out.println("CB ile geçtiniz...");
        }else if(not >= 70){
            System.out.println("CC ile geçtiniz...");
        }else if(not >= 65){
            System.out.println("DC ile geçtiniz...");
        }else if(not >= 55){
            System.out.println("FD kaldınız...");
        }else{
            System.out.println("FF kaldınız...");
        }
       
    }
}
