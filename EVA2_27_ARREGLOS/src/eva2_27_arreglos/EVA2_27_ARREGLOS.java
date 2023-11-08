
package eva2_27_arreglos;

import java.util.Scanner;

/* @author CCERDA
 */
public class EVA2_27_ARREGLOS {
    public static void main(String[] args) {
        int[] enteros= new int[10]; 
        Scanner input = new Scanner(System.in);
        //aleatorio en compu es que se puede seleccionar 
        //se accede a cualquier valor sabiendo el indice
        //los valores almaceandos tiene una direccion
        //empieza en 0
        
        enteros[0]= 100;
        enteros[1]= 1003;
        enteros[2]= 1700;
        enteros[3]= 1300;
        enteros[4]= 1040;
        enteros[5]= 1007;
        enteros[6]= 1050;
        enteros[7]= 1200;
        enteros[8]= 400;
        System.out.println("valor 9:");
        enteros[9]= input.nextInt();
        
        System.out.println("Valor en posicion: " + enteros[9]);
        
        String[] cadena={"abs","cvs", "xyz"};
        System.out.println("Cadena en posicion: " + cadena[2]);
    }
    
}
