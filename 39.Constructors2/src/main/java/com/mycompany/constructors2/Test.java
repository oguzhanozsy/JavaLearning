/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructors2;

/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) {
        
        Account account1 =  new Account();
        //System.out.println(account1.getEmail());
    
        
        Account account2 = new Account("Ahmet Can" , "asdfg@gmail.com" , "31313131313");
        
        /*
        System.out.println(account2.getEmail());
        System.out.println(account2.getBakiye());
        */
        
        account2.bilgilerigoster();
    }
}
