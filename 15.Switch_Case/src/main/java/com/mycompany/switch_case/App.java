/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switch_case;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        /*
        switch(op){
            case durum1:
                işlemler....
                break;
            
            case durum2:
                işlemler....
            
                break;
            //
            //
            default:
                işlemler
                break;
        */
        
        Scanner a = new Scanner(System.in);
        
        int islem = a.nextInt();
        
        switch (islem) {
            case 1:
                System.out.println("1.işlem");
                break;
            case 2:
                System.out.println("2.işlem");
                break;
            case 3:
                System.out.println("3.işlem");
                break;
            case 4:
                System.out.println("4.işlem");
                break;
            default:
                System.out.println("Geçersiz İşlem...");
                break;
        }
    }
}
