/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_26_ciclos_anidados;

import java.util.Scanner;

/*@author CCERDA
 */
public class EVA2_26_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        int n, num;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }
        
        System.out.println("------------------------------");
        
        for (int i = num; i >= 1; i--) {
            for (int j = 0; j < 10; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Introduce otro numero: ");
        n = input.nextInt();
        for (int i = 1; i<n +(n/2) ; i++) {
            for (int j = n +(n/2); j > i; j--) {
                System.out.print("");
            }
            
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }



    }
}
