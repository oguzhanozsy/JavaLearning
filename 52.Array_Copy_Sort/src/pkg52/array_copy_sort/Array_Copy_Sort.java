/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg52.array_copy_sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Array_Copy_Sort {

    public static int[] array_doldur(int sayi){
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        
        for(int i = 0 ; i < sayi ; i++){
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    } 
    
    public static void arrayi_bastir(int[] array){
        
        for(int i = 0 ; i < array.length ; i++){
            System.out.println("Element " + (i+1) + ": " + array[i]);
        }
    }
    
    public static void array_sort(int [] array){
        
        Arrays.sort(array); // arrayleri küçükten büyüğe sıralamaya yarayan fonksiyon...
        arrayi_bastir(array);

    }
    
    
    public static void main(String[] args) {
    
      /*  
        int[] a = array_doldur(5);
        arrayi_bastir(a);
      */
      
        int[] a = array_doldur(5);

        array_sort(a);
        
        
        
        // arrayleri karşılaştırma...
        
        int[] a1 = {1,2,3,4,5,6,7,8,9};
        int[] a2 = {1,2,3,4,5,6,7,8,9};
        
        if(Arrays.equals(a1,a2)){
            System.out.println("Arrayler Esittir...");
        }else {
            System.out.println("Arrayler Esit Degildir...");
        }
    }
    
    
    
}
