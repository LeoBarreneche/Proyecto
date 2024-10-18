
package pruebaanube;

import java.util.*;


public class PruebaANube {

    
    public static void main(String[] args) {
        ArrayList <Integer> ci = new ArrayList <Integer>();
        
        ci.add(46824125);
        
        System.out.println("Cedula ingresada: "+ ci.get(0));
        Scanner input = new Scanner(System.in);
        int cedula;
        
        for (int i = 0; i < 5 ; i++) {
            System.out.println("ingrese cedula: ");
            cedula = input.nextInt();
            ci.add(cedula);
        }
        
        for (int i = 0; i < ci.size(); i++) {
            System.out.println("Cedula: "+ ci.get(i));
        }
    }
    
}
