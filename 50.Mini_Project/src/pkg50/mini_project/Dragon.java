/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg50.mini_project;

/**
 *
 * @author ASUS
 */
public class Dragon extends Beyblade{
    
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Kutsal Canavar Adi: " + kutsalCanavar);
        System.out.println("Gizli Yetenek: " + gizliYetenek);
    
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " 'i ortaya cikariyor...");
        System.out.println(getBeybladeci() + " 'in Saldirisi: Hayalet Saldirisi...");
    }
    
    
}
