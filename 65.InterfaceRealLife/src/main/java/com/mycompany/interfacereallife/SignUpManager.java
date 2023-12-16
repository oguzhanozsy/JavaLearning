/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacereallife;

/**
 *
 * @author ASUS
 */
public class SignUpManager {
    
    private IUserCheckService iUserCheckService;

    public SignUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }
    
    
    
    public void signUp(User user){
        
        AgeUserCheckServise ageUserCheckServise = new AgeUserCheckServise();
        
        if(ageUserCheckServise.checkUser(user)){
            System.out.println("Kullanici Kayit Oldu: " + user.getName());
        }else{
            System.out.println("Kullanici Kayit Olamadi");
        }
        
        
    }
}
