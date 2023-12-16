/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacereallife;

/**
 *
 * @author ASUS
 */
public class User {
    
    private int id;
    private String name;
    private int age;
    
    public User(int id, String name, int age){
        
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        
    }   
        
    
    
    public void setId(int id){
        
        this.id = id;
    }
    
    public int getId(){
        
        return this.id;
    }
    
    public void setName(String name){
        
        this.name = name;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public void setAge(int age){
        
        this.age = age;
    }
    
    public int getAge(){
        
        return this.age;
    }
    
    
}
