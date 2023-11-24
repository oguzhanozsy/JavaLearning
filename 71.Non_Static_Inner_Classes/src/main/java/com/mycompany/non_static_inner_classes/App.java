/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.non_static_inner_classes;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        /*
        1. Statik Olmayan Inner Classlar
        2. Statik Inner Classlar
        3. Lokal(Yerel) Inner Classlar
        4. Anonymous(Anonim) Inner Classlar
        */
        
        /*
        KONU ANLATIMI:
        ->Inner Classlar iç içe classlardır...
        ->Inner class sayesinde çoklu kalıtım yapmayı sağlar...
        */
        
        
        
        Matematik.Factoriyel factoriyel = new Matematik().new Factoriyel();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daire_alan = new Matematik().new Alan().new DaireAlan();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi Giriniz:");     
        int sayi = scanner.nextInt();
        
        if(asal.asal_mi(sayi)){
            System.out.println("Bu sayi Asaldir...");
        }else{
            System.out.println("Bu sayi asal değildir...");
        }
        
        factoriyel.faktoriyel();
        //alan.daire_alan(5);
        daire_alan.daire_alan(6);
        
        
    }
}
