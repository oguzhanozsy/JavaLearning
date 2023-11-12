/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg56.arraylists;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ArrayLists {

    public static void yazdir(ArrayList<String> a){
        
        for(int i = 0 ; i < a.size() ; i++){
            
            System.out.println("Element " + (i+1) + ": " + a.get(i));
        }
    }
    


    public static void main(String[] args) {
        
        // arraylerin genişletilebilir hali gibi düşünülebilir...

        // arrayList oluşturma        
        ArrayList<String> arrayList = new ArrayList<String>();
        
        
        
        // arrayList'e değer atama...
        arrayList.add("Metallica");
        arrayList.add("Guns'n Rosea");
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");
        arrayList.add("Iron Maiden");
        
        
        
        // arrayList'i yazdırma...
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(3));
        
        
        // arrayList'in boyutunu yazdirma...
        
        System.out.println(arrayList.size());

        // arrayListten eleman silme(2 şekilde olur)...
        
        arrayList.remove(1);
        arrayList.remove("Metallica");
        
        // arrayListteki elemanın konumunu öğrenme...
        System.out.println(arrayList.indexOf("Iron Maiden")); // baştan başlayarak tarar...
        System.out.println(arrayList.lastIndexOf("Iron Maiden")); // sondan baslayarak tarar...
        System.out.println(arrayList.indexOf("Dream Theater")); // olmayan bir değeri aratırsak -1 döndürür...
        
        
        // arrayListteki bir elemanın değerini değiştirme(güncelleme)...
        
        arrayList.set(0, "Megadeth");
        
        
        // arrayListlerde döngü kullanma...
        
        for(int i = 0 ; i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i));
        }
        
        yazdir(arrayList);
        
        
        
    }
    
}
