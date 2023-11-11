/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica_4;

import java.util.Scanner;

/*@author CCERDA
 */
public class EVA2_PRACTICA_4 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        do {            
        System.out.println("Inserte un num entero: ");
        int num = input.nextInt();
        
        if (num>0) {
            System.out.println("Tu num es positivo");
        } else if(num ==0){
            System.out.println("Tu num es el 0");
        } else System.out.println("Tu num es negativo");
        
        System.out.println("Quieres terminar el programa(Y/n)");
        String resp= input.next();
            if (resp.equalsIgnoreCase("Y")) {
                System.out.println("Programa terminado");
                break;
            }else{System.out.println("Continuando");}
            
        } while (true);
        
    }
}
