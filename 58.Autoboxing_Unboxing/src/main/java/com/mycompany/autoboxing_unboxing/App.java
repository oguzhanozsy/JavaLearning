/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.autoboxing_unboxing;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {

        /*
            Wrapped Class
            
            boolean ---------> Boolean
            char ------------> Character
            byte ------------> Byte
            short -----------> Short
            int -------------> Integer
            long ------------> Long
            float -----------> Float
            double ----------> Double
        */
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        
        for(int i = 0 ; i < 10 ; i++){
            
            arraylist2.add(Integer.valueOf(i*4)); // Autoboxing...
            // arraylist2.add(i*4); yukarıdakinin yerine bunu yazsak da java anlıyor...
        }
        
        for(int i = 0 ; i < arraylist2.size() ; i++){
            System.out.println(arraylist2.get(i).intValue()); // Unboxing...
            // System.out.println(arraylist2.get(i)); yukarıdakinin yerine bunu yazsak da java anlıyor...
            
        }

        
        
    }
}
