/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica_1;

import java.util.Scanner;

/**
 *
 * @author karlo
 */
public class EVA2_PRACTICA_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, val;
        System.out.println("Inserte 2 numeros: ");
        num = input.nextInt();
        val = input.nextInt();
        System.out.println("Se imprimiran de manera ascendente los numeros entre ellos");
        
        
        //agregar un if si para ambos

        if (val > num) {
            for (int i = (num+1); i < val ; i++) {
            System.out.println(i);
            }
            
        } else {
            for (int i = (val + 1); i < num; i++) {
                System.out.println(i);
        }
            
            
        }
    }
}
