/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructors1;

/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) {

        // Account account1 = new Account(); //javanın kendi yazdığı boş constructordır...
               
        /*
        Constructor kullanmadan değer atayıp yazdırma...
        account1.setHesapNo("123456");
        account1.setBakiye(1000);
        account1.setIsim("Oğuzhan Özsoy");
        account1.setEmail("asdfg@gmail.com");
        account1.setTelefonNo("31313131313");
        System.out.println("Bakiye + " + account1.getBakiye());
        */
        
        
        Account account2 = new Account("123456" , 1000 , "Oğuzhan Özsoy" , "asdfg@gmail.com" , "31313131313" );
        
        account2.paraYatir(500);
                
    }
}
