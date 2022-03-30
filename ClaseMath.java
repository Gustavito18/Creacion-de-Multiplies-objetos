
package clasemath;

import java.util.Scanner;

public class ClaseMath {
 public static Scanner s = new Scanner (System.in); 
    
   public static void main(String[] args) {
       estructuraContro2();
      
    }
    

 //Elevacion a Potencia 
    private static void estructuraContro2() {
        double b = 0.0, e = 0.0;
        
        System.out.println("Ingrese su base: ");
        b = s.nextDouble();
        System.out.println("Ingrese su exponente: ");
        e = s.nextDouble();
      
        double elevacion = Math.pow(b, e);
        
        System.out.println("Su respuesta es: " + elevacion);
    }


}
