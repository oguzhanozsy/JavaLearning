/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructors1;

/**
 *
 * @author ASUS
 */
public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;
    
    public Account(){  //kendi yazdığımız constructordır ismi classın ismiyle aynı olmak zorundadır...
        
        System.out.println("Kendi Yazdığımız Constructordır...");
        
    }
    
    public Account(String hesapNo , double bakiye , String isim , String email , String telefonNo){ //kendi yazdığımız constructor...
        
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }
    

    public void paraYatir(double miktar){
        
        bakiye += miktar; //this.bakiye += miktar; şeklinde de yazılabilir.
        System.out.println("Yeni Bakiye = " + bakiye);

    }
    
    public void paraCekme(double miktar){
        
        if(miktar > 1500){
            System.out.println("Bir günde 1500 tlden fazla para çekemezsiniz...");
        }
        
        if(bakiye - miktar < 0){
            System.out.println("Yeterli bakiye yok. Bakiye = " + bakiye );
        }else{
            bakiye -= miktar;
            System.out.println("Yeni Bakiye = " + bakiye);
        }
        
    }
    
    
    
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
    
    
    
}
