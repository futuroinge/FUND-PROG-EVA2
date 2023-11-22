/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_34_for_each;

/*@author carlosce
 */
public class EVA_34_FOR_EACH {
    public static void main(String[] args) {
        //for each solo sirve para leer arreglos 
        int arreglo[] = new int[10];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int)(Math.random()*100);
        }
        
        for (int valor :arreglo){
            System.out.println("[" + valor + "]");
            
        }
        System.out.println("");
        String mensaje[] = {"Hola"," ","Mundo", " ","cruel!!!"};
        for (String valor:mensaje){
            System.out.println("[" + valor + "]");
            
        }


    }
    
}
