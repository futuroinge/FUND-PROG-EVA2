/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_carreras;
import java.util.Scanner;

/* @author carloscerda
 */
public class EVA2_10_CARRERAS {

        public static void main(String[] args) {
            System.out.println(" Introduce la siglas de tu carrera");
            Scanner input = new Scanner(System.in);
            String major;
            major=input.nextLine();
                
                 switch(major){
                     case ("ISC"): 
                        System.out.println("Ingenieria en Sistemas Computacionales");
                        break;
                     case "IF": 
                        System.out.println("Ingenieria Informatica");
                         break;
                     case "IGE": 
                        System.out.println("Ingenieria en Gestion Empresarial");
                        break;
                     case "IND":
                        System.out.println("Ingenieria Industrial");
                        break;
                     case "IDI": 
                        System.out.println("Ingenieria en Disenio Industrial");
                        break;
                     case "LA": 
                        System.out.println("Licenciatura en Administracion");
                        break;
                     case "ARQ": 
                        System.out.println("Arquitectura");
                        break;
                 }
    }
}
