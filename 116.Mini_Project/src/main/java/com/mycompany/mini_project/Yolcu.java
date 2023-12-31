/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_project;

import java.util.Scanner;

class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi Yasaginiz Bulunuyor...");
    }
    
    
}

class VizeException extends Exception{
    
    @Override
    public void printStackTrace() {
        System.out.println("Gideceginiz Ulkeye Vizeniz Bulunmamaktadir...");
    }
}

class HarcException extends Exception{
    
    @Override
    public void printStackTrace() {
        System.out.println("Lutfen Yurtdisi Harcini Tam Yatirin...");
    }
}

public class Yolcu{
    
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
    
    
    public void yurtdisiHarciKontrol() throws HarcException{
        
        if(this.harc < 15){
            
            throw new HarcException();
            
        }else{
            
            System.out.println("Yurtdisi Harci Islemi Tamam...");

        }
        
        
        
    }
    
    public void siyasiYasakKontrol() throws SiyasiException{
        
        if(this.siyasiYasak == true){
            
            throw new SiyasiException();
           
        }else{
            
            System.out.println("Siyasi Yasaginiz Bulunmuyor...");
            
        }
     
    }
    
    public void vizeDurumuKontrol() throws VizeException{
        
        if(this.vizeDurumu == true){
            
            System.out.println("Vize Islemleri Tamam...");
            
        }else{
            
            throw new VizeException();
            
        }
        
    }
    
    
}
