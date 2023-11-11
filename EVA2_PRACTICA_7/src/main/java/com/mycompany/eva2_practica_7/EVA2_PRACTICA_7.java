/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica_7;

import java.util.Scanner;

/* @author CCERDA
 */
public class EVA2_PRACTICA_7 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=0;
        int max = num;
        int min = num;
        do {  
            System.out.println("Introduce un numero entre 0 al inf: ");
            num = input.nextInt();
            if (num>max) {
                max=num;
            }
            
            if (num<min) {
               min=num; 
            }
            
        } while (num>=0);{System.out.println("Alto ahi, Num Invalido");}
        
        System.out.println("El num max fue: "+ max );
        System.out.println("El num min fue: "+ min);
    }
}
