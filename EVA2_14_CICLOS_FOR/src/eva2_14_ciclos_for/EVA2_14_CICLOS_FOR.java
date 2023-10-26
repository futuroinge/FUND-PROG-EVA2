/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_ciclos_for;

/**
  @author CARLOS CERDA
 */
public class EVA2_14_CICLOS_FOR {
    public static void main(String[] args) {
        //for(punto de inicio; condicion termino; manera de avanzar o retroceder)
        //++ sumar unp a una variable, existe un menos menos
        // += o -= incremento o decremento controlado (es mejor)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        
        /*int variable =10;
        variable++;
        System.out.println(variable);
        variable -= 5;
        System.out.println(variable);
        */
        System.out.println("otro for____________");
        for (int i = 9; i >-1 ; i--) {
            System.out.println(i);
        } //SE VE MAL CON NUMEROS NEGTIVOS (i>=0) mas recomendada 
        
        System.out.println("otro for____________");
        
        for(int i = 0; i <= 100 ; i+=2) {
                    System.out.print(i+ " - ");

            
        }
        }
        
        }
    }
