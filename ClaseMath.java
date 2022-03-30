
package clasemath;

import java.util.Scanner;

public class ClaseMath {
 public static Scanner s = new Scanner (System.in); 
    
   public static void main(String[] args) {
       estructuraContro4();
      
    }
    

//Numero Aleatoria
        private static void estructuraContro4() {
       double random = Math.random();
       
       System.out.println("Su numero radom es: " + random);
    }

}
