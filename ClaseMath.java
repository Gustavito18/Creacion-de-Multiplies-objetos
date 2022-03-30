
package clasemath;

import java.util.Scanner;

public class ClaseMath {
 public static Scanner s = new Scanner (System.in); 
    
   public static void main(String[] args) {
       estructuraContro1();
      
    }
    
   //Raiz Cuadrada
    private static void estructuraContro1() {
     double valor = 0.0;
    
    System.out.println("Ingrese su valor:");
    valor = Double.parseDouble(s.nextLine());
    double raizcuadrada = Math.sqrt(valor);
    
       System.out.println("Su raiz es de:" + raizcuadrada);
    }
    


}
