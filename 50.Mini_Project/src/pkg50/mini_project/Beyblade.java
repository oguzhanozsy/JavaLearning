/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg50.mini_project;

/**
 *
 * @author ASUS
 */
public class Beyblade {
    
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladeci, int donusHizi, int saldirigucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    public void saldir() {
        System.out.println(beybladeci + " " + saldiriGucu + " ve " + donusHizi + " ile saldiriyor...");
    }
    
    public void kutsalCanavarOrtayaCikar() {
    
        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor...");
    }

    public void bilgileriGoster() {
        System.out.println("Beybladeci Ismi: " + beybladeci);
        System.out.println("Saldiri Gucu: " + saldiriGucu);
        System.out.println("Donus Hizi: " + donusHizi);

    } 
            
            
}
