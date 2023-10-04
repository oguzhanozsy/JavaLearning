/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg49.polymorphism2;

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

class Kus extends Hayvan {

    public Kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " otuyor..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void konustur(Object object) {
        //System.out.println(object.konus());
        
        if(object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());
        }
        else if(object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        }
        else if(object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());
        }
        else if(object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        }
    }
    public static void main(String[] args) {

        // instanceof bir objenin hangi class'ta olduğunu bulurken kullanılır.
        
        /* Kopek kopek = new Kopek("Karabas");
            
            if(kopek instanceof Kopek) {
                System.out.println("Bu nesne Hayvan Sınıfındadır");
           }
        */
        
        Kopek kopek = new Kopek("Karabas");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("At");
        Hayvan hayvan = new Hayvan("Limon");
        Kus kus = new Kus("Zeytin");
        
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kus);
        
    }
    
}
