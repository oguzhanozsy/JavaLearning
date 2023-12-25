/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.local_inner_classes;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
       
        /*
        KONU ANLATIMI:
        --> Lokal inner classlar metodların özelliğidir sanki bir özellik tanımlanırmış gibi methodların içinde bu classları tanımlayabiliriz...
        --> Bu classlara başka metodlardan erişemeyiz çünkü tanımlandığı metoda özeldir...
        --> Lokal inner classları oluştururken public,static gibi anahtar kelimeler kullanamıyoruz çünkü sadece classa bir özellik tanımlanacağı zaman kullanabiliriz... 
        */
        
        class Alan{
            
            public void daire_alan(int yaricap){
                
                System.out.println("Dairenin Alani: " + yaricap * yaricap * Math.PI);
            }
        }
        
        Alan alan = new Alan();
        Alan alan2 =new Alan();
        
        alan.daire_alan(4);
        alan2.daire_alan(10);
        
        
        
        
        
    }
}
