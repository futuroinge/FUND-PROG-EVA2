/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica_3;

import java.util.Scanner;

/*@author CCERDA
 */
public class EVA2_PRACTICA_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, x,z;
        System.out.println("Introduce un numero");
        num = input.nextInt();
        System.out.println("La sumatoria de todos los números desde el 1 hasta ese num es:");
        x = 0;
        z= 0;
        int i = 1;
        for (; i <= num; i++) {
            x += i;
            z = x;
        }
        System.out.println(z);
    }
}
