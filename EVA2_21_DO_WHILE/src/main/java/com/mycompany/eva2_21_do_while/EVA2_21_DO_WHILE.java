/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_21_do_while;

import java.util.Scanner;

/**
 *
 * @author karlo
 */
public class EVA2_21_DO_WHILE {

    public static void main(String[] args) {
         int valor;
         Scanner input = new Scanner(System.in);
         //asegura que la accion ocurra almenos una vez
         do {            
             System.out.println("Introduce un valor");
             valor = input.nextInt();
        } while (valor!= 100);
         



    }
}
