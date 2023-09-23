/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop02;

/**
 *
 * @author ASUS
 */
public class Araba {
    
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;
    
    //Artık burda static ifadesini kullanmayacağız çünkü metodlarımız objelere özel olucak.
    //Eğer kullanırsak metodlarımız classlara özgü olur yani başka yerden erişim sağlayamayız.
    public void setModel(String model){ //model2
    //setModel metodu mainde değer atamasını sağlar.    
       this.model = model; //metotun içindeki değişken ismiyle objenin özelliğinin ismi aynı olduğu zaman java sıkıntı çıkarıyor bunu aşmak içinde this ifadesini kullanırız.
                           // veya 2. yol     model = model2; ifadesini kullanmak. 
    }
    
    public String getModel(){
    // getModel metodu mainde atanan değeri ekrana yazdırılırken kullanılır.    
        return model; //return this.model de kullanılabilir burda farkı yok.
    }
    
    
    // setter,getter metodlarını otomatik yapmak için -->sağ tık/refactor/encapsulate fields.
    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        
        if(kapilar < 0){
            
            System.out.println("Kapı Sayısı Sıfırdan Küçük Olamaz...");
        
        }else{
            
            this.kapilar = kapilar;
        }
        
    }

    /**
     * @return the tekerlekler
     */
    public int getTekerlekler() {
        return tekerlekler;
    }

    /**
     * @param tekerlekler the tekerlekler to set
     */
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
            
    
    
    
    
}
