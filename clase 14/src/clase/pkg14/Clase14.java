/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg14;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int cantidad=0,i=0;
        String nombre="",color="";
        System.out.println("Cuantas frutas desea registrar? ");
        cantidad=entrada.nextInt();
        entrada.nextLine();
      FDulces[] frutas=new FDulces[cantidad];
      while(i<cantidad){
          System.out.println("Ingrese el nombre");
          nombre=entrada.nextLine();
          System.out.println("Ingrese el color");
          color=entrada.nextLine();
          frutas[i]=new FDulces(color,nombre);
          ++i;
      }
        for (FDulces fruta : frutas) {
            System.out.println(fruta.toString());
        }
    }
    
}
