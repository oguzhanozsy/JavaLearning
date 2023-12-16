/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacereallife;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {

        SignUpManager signUpManager = new SignUpManager(new AgeUserCheckServise());
        signUpManager.signUp(new User(1, "Mustafa", 26));
        
    }
}
