/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg53.multidimensional_arrays;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Multidimensional_Arrays {

    
    public static void main(String[] args) {
        
        int[][] array = new int[2][2];
        
        array[0][0] = 10;
        array[0][1] = 20;
        array[1][0] = 30;
        array[1][1] = 40;
        
        /*****************************/
         
        int[][] array2 = {{10,20},{30,40}};
        System.out.println(array2[0][1]);
        
        /*****************************/
        
        int[][] array3 = new int[2][2];
        
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 2 ; i++){
            
            for(int j = 0 ; j < 2 ; j++){
                
                array3[i][j] = scanner.nextInt();
            }
        }
        
        for(int i = 0 ; i < 2 ; i++){
            
            for(int j = 0 ; j < 2 ; j++){
                
                System.out.print(array3[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
