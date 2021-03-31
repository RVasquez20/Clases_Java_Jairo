/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner entrada=new Scanner(System.in);
//    /**
//     * EDD=Estructura de datos
//     * TDA=Tipos de datos Abstractos
//     * ArrayList->Stack->Queue
//     * @param args the command line arguments
//     */
////Datos Primitivos: byte,int,long,short,float,double,boolean,char
////Datos no Primitivos: Integer,Double,Float,Character,String
////Declarando e inicializar un ArrayList 
////5->1->2->6->10
////0  1  2  3  4
//        ArrayList<Integer> miPrimerArrayList=new ArrayList<>();
//        //Ingreso de datos
//        miPrimerArrayList.add(5);
//        miPrimerArrayList.add(1);
//        miPrimerArrayList.add(2);
//        miPrimerArrayList.add(6);
//        miPrimerArrayList.add(10);
//        
//        //Mostrar Valores mas no sacarlos
//        //Opcion 1 Para recorrer y mostrar los elementos de un arraylist
//        //fori=for i=0
//        for (int i = 0; i < miPrimerArrayList.size(); i++) {
//            System.out.print(miPrimerArrayList.get(i)+",");
//        }
//        System.out.println("");
//        
//        //Opcion 2 Para recorrer y mostrar los elementos de un arraylist
//        //fore=foreach
//        for (Integer x : miPrimerArrayList) {
//            System.out.print(x+",");
//        }
//        System.out.println("");
//        
//        //Opcion 3 Para recorrer y mostrar los elementos de un arraylist
//        System.out.println(Arrays.asList(miPrimerArrayList));
//        
//        //Eliminar o Remover un Elemento del ArrayList
//        //Eliminar Todos Los Elementos del ArrayList
//        miPrimerArrayList.removeAll(miPrimerArrayList);
//        System.out.println(Arrays.asList(miPrimerArrayList));
//        miPrimerArrayList.add(5);
//        miPrimerArrayList.add(1);
//        miPrimerArrayList.add(2);
//        miPrimerArrayList.add(6);
//        miPrimerArrayList.add(10);
//          miPrimerArrayList.add(2);
//        miPrimerArrayList.add(6);
//        miPrimerArrayList.add(10);
//          System.out.println(Arrays.asList(miPrimerArrayList));
//          
//          //Eliminar Todos Los Elementos del ArrayList
//        miPrimerArrayList.clear();
//        System.out.println(Arrays.asList(miPrimerArrayList));
//          miPrimerArrayList.add(5);
//        miPrimerArrayList.add(1);
//        miPrimerArrayList.add(2);
//        miPrimerArrayList.add(6);
//        miPrimerArrayList.add(10);
//          miPrimerArrayList.add(1222);
//        miPrimerArrayList.add(12);
//        miPrimerArrayList.add(122);
//          miPrimerArrayList.add(12232);
//        miPrimerArrayList.add(124);
//        miPrimerArrayList.add(1225);
//          System.out.println(Arrays.asList(miPrimerArrayList));
//          miPrimerArrayList.remove(10);
//          System.out.println(Arrays.asList(miPrimerArrayList));
//          miPrimerArrayList.clear();
//          miPrimerArrayList.add(5);
//        miPrimerArrayList.add(1);
//        miPrimerArrayList.add(2);
//        miPrimerArrayList.add(6);
//        miPrimerArrayList.add(10);
//          miPrimerArrayList.add(1222);
//        miPrimerArrayList.add(12);
//        miPrimerArrayList.add(122);
//          miPrimerArrayList.add(12232);
//        miPrimerArrayList.add(124);
//        miPrimerArrayList.add(1225);
//        
//        //Cantidad de Elementos
//        System.out.println(miPrimerArrayList.size());
//        
//        //Ordenar un Array Ascendente
////        [[5, 1, 2, 6, 10, 1222, 12, 122, 12232, 124, 1225]]
//Integer Array[]={5,1,2,6,10,1222,12,122, 12232, 124, 1225};
//Arrays.sort(Array);
//        System.out.println(Arrays.toString(Array));
//        
//       //Ordenar un Array descendente
//       Arrays.sort(Array,Collections.reverseOrder());
//       System.out.println(Arrays.toString(Array));
//       
//       //Saber Si existe un Elemento en el ArrayList(Busqueda)
//        System.out.println("Ingrese el numero que desea buscar dentro del ArrayList");
//        int numeroBusqueda=entrada.nextInt();
//        //ifelse genera un if con el else
//        if (miPrimerArrayList.contains(numeroBusqueda)) {
//            System.out.println("Si Esta en el ArrayList");
//        } else {
//            System.out.println("No Esta en el ArrayList");
//        }
//        
//        //Saber si el ArrayList Esta Vacio
//        //miPrimerArrayList.clear();
//        if(miPrimerArrayList.isEmpty()){
//            System.out.println("Esta Vacio");  
//        }else{
//            System.out.println("No Esta Vacio");
//        }
//        

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
         //TAREA:Todo lo que hemos visto
         /**
          * Todo Con JOptionPane
          * Hacer un pequeño supermercado con la posibilidad de imprimir una factura en pantalla
          * en donde se muestre lo que compro cada 
          * cliente (cliente(cola)) y mostrar el total de cada compra.(Pueden comprar solo 1 producto)
          * Nombre:juan
          * Apellido:eutanasio
          * Fecha:hoy
          * Productos:
          * Producto      Cantidad      Costo Unitario 
          * -----------------------------------------------
          * Pan             5               10
          * ------------------------------------------------
          * Total A Pagar:50
          * 
          */
    }
    
}
