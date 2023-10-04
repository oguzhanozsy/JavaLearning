/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg50.mini_project;

/**
 *
 * @author ASUS
 */
public class BeybladeFabrikasi {
    
    public Beyblade beybladeUret(String beyblade_turu) {
        
        if(beyblade_turu.equals("Dragon")){
            
            return new Dragon("Takao",800,300,"Mavi Ejderha","Kutsal Canavarla Konusma");
        }
        else if(beyblade_turu.equals("Dranza")) {
            
            return new Dranza("Kai",600,400,"Kirmizi Anka Kusu");
            
        }
        else if(beyblade_turu.equals("Drayna")) {
            
            return new Dranza("Rei",800,250,"Beyaz Kaplan");
        }
        else if(beyblade_turu.equals("Draciel")) {
            
            return new Dranza("Max",400,100,"Kara Kaplumbağa"); 
        }
        else {
            return null;
        }
            
         
    } 
}
