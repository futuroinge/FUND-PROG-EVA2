/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica_8;

import java.util.Scanner;

/*@author CCERDA
 */
public class EVA2_PRACTICA_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {  
            System.out.println("Introduce una letra");
            String letra = input.nextLine();
            switch (letra.toUpperCase()) {
            case "A","E","I","O","U":
                System.out.println("Vocal");
                break;
            case "B","C","D","F","G","H","J","K","L","M","N":
                System.out.println("Consonante");
                break;
            case "Z","P","Q","R","S","T","V","W","X","Y":
                System.out.println("Consonante");
                break;
            case " ":
                System.out.println("Ni siquiera es una letra");
                return;       
        }
        } while (true);

    }
}
