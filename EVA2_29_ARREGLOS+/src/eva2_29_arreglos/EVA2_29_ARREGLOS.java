
package eva2_29_arreglos;

/*
 * @author CCERDA
 */
public class EVA2_29_ARREGLOS {
    public static void main(String[] args) {
        int[] arreglo = new int[20];
        for(int i=0; i<20; i++)
            //un fabuloso CASTING
            //unicamente en datos compatibles
            arreglo[i] = (int)(Math.random()*100);
        
        for (int i = 0; i < 20; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }

    }
    
}
