/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_promedio_califas;

import java.util.Scanner;

/* @author invitado
 */
public class EVA2_15_PROMEDIO_CALIFAS {

    public static void main(String[] args) {
        //soliccitar la contidad de califas a capturar
        int cantcal;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de calificaciones a capturar");
        cantcal = input.nextInt();
        int sumacalifa = 0;
        //acumulador

        for (int i = 1; i <= cantcal; i++) {
            System.out.println("Introduce la Calificacion: ");
            int califa = input.nextInt();
            //acumulador
            sumacalifa= sumacalifa + califa;
        }
        //System.out.println("La sumatoria es: " +  sumacalifa);
        //se tiene que enganiar ajava para penar que cantcali es double
        double promedio= sumacalifa/ (cantcal*1.0);
        System.out.println("El promedio de calificaciones es: " + promedio);
        
       

    }

}
