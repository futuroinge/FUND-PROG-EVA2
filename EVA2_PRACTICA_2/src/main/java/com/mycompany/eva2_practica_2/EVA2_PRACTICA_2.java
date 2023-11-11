/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica_2;

import java.util.Scanner;

/*@author CCERDA    
 */
public class EVA2_PRACTICA_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, val;
        System.out.println("Ingrese 2 valore(enteros positivos): ");
        num = input.nextInt();
        val = input.nextInt();
        
        if (val > num) {
            for (int i = (num+1); i < val; i++) {
             if ((i % 2) != 0)
                 continue;
             System.out.print( i + " - ");}
            
        } else {
            for (int i = (val+1); i < num ; i++) {
             if ((i % 2) != 0)
                 continue;
             System.out.print( i + " - ");}
        }
        
        
    }
}
