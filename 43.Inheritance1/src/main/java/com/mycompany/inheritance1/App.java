/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance1;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        // inheritance da IS-A ilişkisi vardır(mülakatlar için önemli bir kavram)...
        
        Yonetici yonetici1 = new Yonetici("Oğuzhan Özsoy" , 10000 , "IT",10);
        
        yonetici1.bilgilerigoster();
        yonetici1.zam_yap(1000);
        
    }
    
    
    
}
