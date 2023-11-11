/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica_5;

import java.util.Scanner;

/* @author CCERDA
 */
public class EVA2_PRACTICA_5 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int base, exp;
        int resul= 1;// no poner nunca cero aqui jaja
        System.out.println("Ingresa solo num enteros positivos");
        System.out.println("Numero base");
        base = input.nextInt();
        System.out.println("Numero exponente");
        exp = input.nextInt();
       
        if (base<0 || exp <0) {
            System.out.println("Numeros invalidos");
            return;
        }
        
        for (int i = 0; i <= exp; i++) {
            resul *=base;
        }
        
        System.out.println("El resultado es: "+resul);
    }
}
