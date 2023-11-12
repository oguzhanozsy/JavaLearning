/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg55.foreach_loop;

/**
 *
 * @author ASUS
 */
public class ForEach_Loop {

   
    public static void main(String[] args) {

        String[] array = {"Elma","Armut","Kiraz"};
        
        for(String a : array){
            System.out.println(a);
        }
        
        /******************************************/
        
        int[] array2 = {1,2,3,4,5,6,7,8,9};
        
        for(int i : array2){
            System.out.println(i);
        }
        
        /******************************************/
        
        // arrayde objeler tutma...
        
        Deneme[] array3 = {new Deneme("Oguzhan"),new Deneme("Ali"),new Deneme("Ahmet")};
        
        for(Deneme d : array3){
            d.yaz();
        }
        
        
    }
    
}
