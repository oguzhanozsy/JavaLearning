/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.charboolean;

/**
 *
 * @author ASUS
 */
public class CharBoolean {

    public static void main(String[] args) {
       
        // Char Veri Tipi : Karakterleri göstermek için kullanılır. 2 byte yer kaplar. 2^16 tane karakter simgeleyebilir...
        // Boolean Veri Tipi : Koşul Durumlarında kullanılır. True veya False değeri alır...
        
        char a = 'A';
        char b = '?';
        char c = 1000;
        char d = '\u0152'; //unicode numarası...
        char e = '\u063C'; //unicode numarası...
                
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
        
        
        boolean x = true;
        boolean y = false;
        
        System.out.println(x);
        System.out.println(y);
    }
}
