/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg48.polymorphism;

/**
 *
 * @author ASUS
 */

class Hayvan {  //başına public koymadık çünkü koyduğumuz zaman isminin ana class ile aynı olması gerekir.
    
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
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
    
    public String konus() {
        
        return "Hayvan Konusuyor...";
    }     
}

// Hayvan class'ından miras alıyor.
class Kedi extends Hayvan { 

    // Constructor...
    public Kedi(String isim) { 
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavliyor..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

// Hayvan class'ından miras alıyor...
class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havliyor..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }    
}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kisniyor..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}



public class Main {

    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* POLYMORPHISM:
           -> Bir tane referans birden fazla obje gibi davranabilir.
        
           Polymorphism oluşma şartları:
           -> Bir tane ana class(Hayvan) olmalı ve geri kalanlar alt sınıf(Kedi,Kopek,At) olmalı.
           -> Alt class'ların referanslarını üst class(super class)'ların referanslarına eşitleyebiliyoruz burda önemli olan inheritance(miras) kavramını kullanıyor olmamız.
           -> Eğer alt class'larda override edilmemişse kendi içindeki fonksiyonu çağırır.
           -> Bir fonksiyona birden fazla farklı nesneler tür dönüşümü yapmadan gönderilebilir.
        */
        
        
        /*
        Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabas");
        Hayvan hayvan3 = new At("Sahbatur");
        
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        */
        
        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Karabas"));
        konustur(new At("Sahbatur"));
        
                
    }
    
}
