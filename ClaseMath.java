
package clasemath;

import java.util.Scanner;

public class ClaseMath {
 public static Scanner s = new Scanner (System.in); 
    
   public static void main(String[] args) {
       estructuraContro3();
      
    }
    
      //Redondear Numero
      private static void estructuraContro3() {
        float redondear = (float) 0.0;
        
        System.out.println("Ingrese su numero a redondear");
        redondear = s.nextFloat();
        
        int respuesta = Math.round(redondear);
        
        System.out.println("Su resultado es: " + respuesta);
    }

}
