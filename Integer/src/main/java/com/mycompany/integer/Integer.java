/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.integer;

/**
 *
 * @author ASUS
 */
public class Integer {

    public static void main(String[] args) {
    
    /*    
        // integer veri tipi -2^31 ile 2^31 arasında değer alır...
       
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    */ 
    
    /*    
        // byte veri tipi hafızada 8 bitlik yer kaplar...
        
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    */        
        
    /*
       // short veri tipi hafızada 2 bytelık yani 16 bitlik yer kaplar...
       
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    */    

    /*
        // en çok tam sayıyı tutan veri tipi longdur...
        
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    */
    
    
        // byte --> short --> int --> long
        // java veri tiplerini soldakileri hep sağdakilere çevirebilir ama sağdakileri sola çeviremez...
        // mesela her byte veri tipi int veri tipinde saklanırken.Her int veri tipi byte da saklanamaz...
        
        // otomatik dönüştürme örneği...
        short j = 1000;
        int i = (j / 2);
        int k = j;
        
        // elle dönüştürme örneği...
        byte a = 100;
        byte b = (byte)(a / 2);
        System.out.println(b);
        
        // otomatik dönüştürme örneği...
        short x = 100;
        byte y = 2;
        int z = 4;
        long d = x + y + z;
        
        System.out.println(d);
        
    }
}
