/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg47.encapsulation;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Abone abone = new Abone();
        
        abone.isim = "Oğuzhan Özsoy";
        abone.bakiye = 200;
        abone.sehir = "Kastamonu";
        
        abone.dogalgaz_kullan(200);*/
        
        GelismisAbone abone = new GelismisAbone("Oğuzhan Özsoy" , 200 , "Ankara");
        abone.bakiye_ogren();
    }
    
    
    
    /* ENCAPSULATION'un 3 Avantajı:
       1) Constructor'daki ifadelerinden bazılarına değer vermediğimiz zaman uyarır...
       2) Objeye verilmemesi gereken bir değeri istediğimiz gibi veremiyoruz bunu kontrol ediyor...
       3) Bir class'taki özelliğin ismini değiştirirsek başka class'ları etkilemez...
    */ 
}
