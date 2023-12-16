/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacereallife;

/**
 *
 * @author ASUS
 */
public class ComplexUserCheckService implements IUserCheckService{
    
    public boolean checkUser(User user){
        if(user.getAge() >= 18 && user.getName().startsWith("Mu")){
            
            return true;
        }
        return false;
    }
}
