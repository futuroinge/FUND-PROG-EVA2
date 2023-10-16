/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_operaciones;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int suma, val1, val2;
      val1 = 100;
      val2 = 200;
      suma = val1 + val2;
      System.out.println("SUMA_______________________");
      System.out.println("100 + 200 es " + suma);
      //el + suma y concatena
      
      int resta;
      resta= val1-val2;
      System.out.println("RESTA_______________________");
      System.out.println("100 - 200 es" + resta);
      
      
      int multi;
      multi = val1*val2;
      System.out.println("MULTIPLICACION______________");
      System.out.println("100x200 es " + multi);
      
      double resu;
      System.out.println("DIVISION_____________________");
      resu = val2/val1;
      val1 = 11;
      val2 = 2;
      System.out.println("La division 11/2 " + resu);
      //mientras el divisor sea doble y la variable a calcular igual no hay problema

      double val2Double = 2;
      resu = val1/val2Double;
      System.out.println("La division 11/2" + resu);
      //int resu= 11/2.0;
      double resul = 11/2.0;
      System.out.println("resul");
      
      // Potenci NO hAY OPERADOR DE PÓTENCIA 
      double potencia= Math.pow (3, 3);
      System.out.println("POTENCIA______________________");
      System.out.println("3 eleado a la 3 = " + potencia);
      
      //Raiz ---> No hay operador 
      double raiz = Math.pow(100, 0.5);
      System.out.println("RAIZ___________________________");
      System.out.println("Raiz de 100 es "+ raiz);
      
      /*  JERARQUIA DE OPERACIONES
         ()
            potencias y raices 
               multiplicacion y division 
                  suma y resta
      */
      
      int resuOP, x = 3, y =2, z=5;
      resuOP= x;
      System.out.println("OPERACIONES_____________________");
      
      
      
      System.out.println("FORMULA GENERAL__________________");
      float a=3, b=9  , c=3;
      double FGp, FGn;
      FGn = ((-b)- Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
      FGp = ((-b)+ Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
      System.out.println("Los valores de x usando la FG es: ");
      System.out.println("X1 = " + FGn);
      System.out.println("X2 = " + FGp);
   }
   
}
