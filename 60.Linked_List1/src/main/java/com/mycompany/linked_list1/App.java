/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linked_list1;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {

        ArrayList<String> diller = new ArrayList<String>();
        
        diller.add("Java");
        diller.add("Php");
        diller.add("Python");
        diller.add("Kotlin");
        diller.add("C#");
        
        /*
        for(int i = 0 ; i < diller.size() ; i++){
            System.out.println(diller.get(i));
        }*/
        
        
        for(String s: diller){
            System.out.println(s);
        }
        
        //LİNKEDLİST'LER ARRAYLİSTLERE GÖRE PERFORMANS AÇISINDAN DAHA İYİDİR AMA HAFISADA DAHA ÇOK YER KAPLAR...
    }
}
