/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.break_continue;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        /*
        -->break:
        Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
        Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.
        
        Break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa ve içteki 
        döngüde break kullanılmışsa sadece içteki döngü sona erer.
        
        -->continue:
        Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman geri kalan işlemlerini
        yapmdan direkt döngü bloğunun başına döner.
        
        While da kullanırken dikkat et sonsuz döngüye girebilir(sondaki örnekteki gibi)
        
        */
        
        
        
        //EXAMPLES...
        
        /*
        int i = 0;
        
        while(i < 20){
            
            if(i == 10){
            
                break;
                            
            }

            System.out.println("i = " + i);
            i++;
            
        }
        */
        
        /*
        Scanner a = new Scanner(System.in);
        
        while(true){
            
            int islem = a.nextInt();
            
            if(islem == -1){
                System.out.println("Döngüden Çıkılıyor...");
                break;
            }
            
            System.out.println("İşlem: " + islem);
        }
        */
        
        /*
        for(int i = 0; i < 10; i++){
            
            if(i == 3 || i == 5){
                continue;
            }
            
            System.out.println("i = " + i);
        }
        */
        
        int i = 0;
        
        while(i < 10){
            
            if(i == 3 || i == 5){
                // i++; sonsuz döngüden çıkmasını bu satır sağlar...
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
        
        
        
    }
}
