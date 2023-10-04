/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg50.mini_project;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("Cikis icin q'ya basin...");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz? ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")) {
                
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else
            {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if(beyblade == null) {
                    System.out.println("Lütfen Geçerli Bir Beyblade İsmi Girin...");
                }
                else
                {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }    
            }    
        }
        
        
    }
    
}
