/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Bankaya Hoşgeldiniz. Faiz Oranı %6");
        
        int ana_para;
        int vade;
        
        System.out.print("Yatırmak istediğiniz tutar : ");
        ana_para = a.nextInt();
        
        System.out.print("Paranızı kaç yıl yatırmak istiyorsunuz : ");
        vade = a.nextInt();

        double toplam_para = ana_para;
        double faiz_orani = 0.06;
        
        for(int i = 1; i <= vade; i++){
            
            toplam_para = (toplam_para * faiz_orani) + toplam_para;
            System.out.println(i + ".yılın sonunda toplam para : " + (int)toplam_para);
            
        }

        
    }
}
