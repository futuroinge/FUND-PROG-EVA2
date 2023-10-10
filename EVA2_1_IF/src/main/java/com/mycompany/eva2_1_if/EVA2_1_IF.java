package com.mycompany.eva2_1_if;
//carloscerda

import java.util.Scanner;


public class EVA2_1_IF {
    public static void main(String[] args) {
        int califa;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Capturar tu calificacion:");
        califa = input.nextInt();
        
        if(califa>= 70){
            System.out.println("APROBADO");
            System.out.println("FELICIDADES");
        }
        /*
            El if evalia una expresion, y usa operadores logicos o condicionales 
            El verdadero es obligatorio 
            El falso(else) es opcional
            Las llaves se usa para relaizar mas de una cosa si es que el if es verdadero
        */
        else System.out.println("NA \ndirecto a recuperacion");
        
        System.out.println("FIN DEL PROGRAMA");
        
    }
}
