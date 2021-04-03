/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg6;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
      //Queue->colas 
Queue<Integer>cola1=new LinkedList<>();
//Agregar Datos
        cola1.add(1);
        cola1.add(5);
        cola1.add(1);
        cola1.add(2);
        cola1.add(6);
        cola1.add(10);
        cola1.add(1222);
        cola1.add(12);
        cola1.add(122);
        cola1.add(12232);
        cola1.add(124);
        cola1.add(1225);
        //Mostrar Datos Mas no Sacarlos
        System.out.println(cola1);
        
        //Sacar Elementos De una Cola
        
        int numeroRemovido=cola1.remove();
         System.out.println("Se removio :"+numeroRemovido+"\n"+cola1);
         
         //Obtener El Elemento que esta al principio de la cola
         int cabecera=cola1.peek();
         System.out.println("Primer Elemento:"+cabecera+"\n"+cola1);
         
         
         //Sacar un elemento Mostrarlo pero sin almacenarlo en una variable
         System.out.println(cola1.poll());
         System.out.println(cola1);
         //Limpiar una cola/Vaciar una cola
         
         if(cola1.isEmpty()){
             System.out.println("La cola esta vacia");
         }else{
             System.out.println("La cola tiene elementos pero la vaciaremos");
             Thread.sleep(5000);
             cola1.clear();
             System.out.println("La cola se vacio");
         }
         
         //Rreingreso de datos
         cola1.add(1);
        cola1.add(5);
        cola1.add(1);
        cola1.add(2);
        cola1.add(6);
        cola1.add(10);
        cola1.add(1222);
        cola1.add(12);
        cola1.add(122);
        cola1.add(12232);
        cola1.add(124);
        cola1.add(1225);
        
        //Busqueda De Elementos

        int numeroBuscado=0;
        numeroBuscado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
        if (cola1.contains(numeroBuscado)) {
            System.out.println("Encontrado");
        } else {
            System.out.println("NO Encontrado");
        }
       
         
    }
    
}
