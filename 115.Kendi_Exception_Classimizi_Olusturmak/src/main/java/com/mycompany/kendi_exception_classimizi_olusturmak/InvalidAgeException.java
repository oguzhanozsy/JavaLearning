/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendi_exception_classimizi_olusturmak;

/**
 *
 * @author ASUS
 */
public class InvalidAgeException extends ArithmeticException{

    public InvalidAgeException(String message){
        
        super(message);
    }
    
    
    @Override
    public void printStackTrace() {
        System.out.println("Bu bir invalid age hatasidir...");
    }
    
    
    
    
}
