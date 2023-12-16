/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_project;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Yolcu implements YurtDisiKurallari{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Yatirdiginiz Harc Bedeli: " );
        this.harc = scanner.nextInt();
        scanner.nextLine(); //bos değer...
        
        System.out.println("Herhangi Bir Siyasi Yasaginiz Bulunuyor Mu(evet/hayir)?");
        String cevap = scanner.nextLine();
        
        if(cevap.equals("evet")){
            
            this.siyasiYasak = true;
        }else{
            
            this.siyasiYasak = false;
        }
        
        System.out.println("Vizeniz Bulunuyor Mu(evet/hayir)?");
        String cevap2 = scanner.nextLine();
        
        if(cevap2.equals("evet")){
            
            this.vizeDurumu = true;
        }else{
            
            this.vizeDurumu = false;
        }
    }
    
    
    public boolean yurtdisiHarciKontrol(){
        
        if(this.harc < 15){
            
            System.out.println("Lutfen Yurtdisi Cikis Harcini Tam Yatirin...");
            return false;
        }else{
            
            System.out.println("Yurtdisi Harci Islemi Tamam...");
            return true;
        }
        
        
        
    }
    
    public boolean siyasiYasakKontrol(){
        
        if(this.siyasiYasak == true){
            
            System.out.println("Siyasi Yasaginiz Bulunuyor. Yurdisina Cikamazsiniz...");
            return false;
        }else{
            
            System.out.println("Siyasi Yasaginiz Bulunmuyor...");
            return true;
        }
     
    }
    
    public boolean vizeDurumuKontrol(){
        
        if(this.vizeDurumu == true){
            
            System.out.println("Vize Islemleri Tamam");
            return true;
        }else{
            
            System.out.println("Vizeniz Gideceginiz Ulkeye Bulunmamaktadir...");
            return false;
        }
        
    }
    
    
}
