/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.object_references;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        /*
        Account account1 = new Account("Oğuzhan Özsoy" , "asdfg@gmail.com" , "31313131313");
        
        Account account2 = account1;
        Account account3 = new Account();
        
        if(account1 == account3){
            System.out.println("Aynı Objeyi Gösteriyorlar...");
        }else{
            System.out.println("Aynı Objeyi Göstermiyorlar...");
        }
        */
        
        new Account("Oğuzhan Özsoy","asdfg@gmail.com","31313131313").bilgilerigoster();//referansa atamadan burdaki gibi yapılabilir ama çok satırlı kodlarda gereksiz uğraştırır...
    }
}
