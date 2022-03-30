
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
    
       //Redondear Numero
      private static void estructuraContro3() {
        float redondear = (float) 0.0;
        
        System.out.println("Ingrese su numero a redondear");
        redondear = s.nextFloat();
        
        int respuesta = Math.round(redondear);
        
        System.out.println("Su resultado es: " + respuesta);
    }
      
      //Numero Aleatoria
        private static void estructuraContro4() {
       double random = Math.random();
       
       System.out.println("Su numero radom es: " + random);
    }

}
