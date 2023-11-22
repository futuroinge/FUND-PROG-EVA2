/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_funciones;

/* @author CARLOSCE
 */
public class EVA3_1_FUNCIONES {
    public static void main(String[] args) {
        //llamada de funcion o precedminiento
        imprimir("Hola mundo", 5);
    }
//static solo trabaja con lo static
//verbo en infinito que indique lo que hace (may clase, min el metodo
    // toda funcion tiene ()
    public static void imprimir(String mensaje, int cant){
        for (int i = 0; i < cant; i++) {
            System.out.println(mensaje);
        }
    }
    
}


