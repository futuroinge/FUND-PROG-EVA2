/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/* @author invitado
 */
public class EVA2_12_CALIFAS_EUA {
    public static void main(String[] args) {
        int grade;
        System.out.println("Ingresa la calificacion numerica");
        Scanner input = new Scanner(System.in);
        grade = input.nextInt();
        
        
        if(grade>0 && grade<=100){
            if(grade>89 && grade<=100) { System.out.println("A");}
            if(grade>79 && grade<=89) { System.out.println("B");}
            if(grade>69 && grade<=79) { System.out.println("C");}
            if(grade>=60 && grade<=69) { System.out.println("D");}
            if(grade<60) { System.out.println("F");}
        }
        else System.out.println("Calificacion No Valida");
    }
    
}
