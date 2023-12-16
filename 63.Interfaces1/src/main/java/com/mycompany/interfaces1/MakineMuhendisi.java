/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces1;

/**
 *
 * @author ASUS
 */
public class MakineMuhendisi implements IMuhendis, ICalisma/*birden fazla implement edebilir....*/{
 
    private boolean askerlik;
    private boolean adli_sicil;
    
    public MakineMuhendisi(boolean askerlik, boolean adli_sicil){
        
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    public void askerlik_durumu_sorgula(){
        
        if(askerlik){
            
            System.out.println("Askerligimi Yaptim...");
        }else{
            
            System.out.println("Askerligimi Henüz Yapmadim...");
        }
        
    }
    
    public String mezuniyet_ortalamasi(double derece){
        
        return "Ortalama: " + derece;
        
    }
    
    public void adli_sicil_sorgula(){
        
         if(adli_sicil){
            
            System.out.println("Adli Sicil Kaydim Bulunuyor...");
            
        }else{
            
            System.out.println("Herhangi Bir Adli Sicil Kaydim Bulunmuyor...");
        }
    }
    
    public void is_tecrubesi(String[] array){
        
        if(array.length == 0){
            
            System.out.println("Herhangi Bir Is Tecrubem Bulunmuyor...");
        }else{
            
            System.out.println("Makine Muhendisi Olarak Su Sirketlerde Calistim:");
            for(int i = 0; i < array.length ; i++){
                System.out.println(array[i]);
            }
        }
    }
    
    public void referans_getir(String[] array){
        
        if(array.length == 0){
            
            System.out.println("Herhangi Bir Referansim Bulunmuyor...");
        }else{
            
            System.out.println("Referanslarim:");
            for(int i = 0; i < array.length ; i++){
                System.out.println(array[i]);
            }
        }
    }
    
    
    public void calis(){
        
        System.out.println("Muhendis Calisiyor...");
    }
    
}
