/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase4 {

    /**
     * EDD=Estructura de datos
     * TDA=Tipos de datos Abstractos
     * ArrayList->Stack->Queue
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Datos Primitivos: byte,int,long,short,float,double,boolean,char
//Datos no Primitivos: Integer,Double,Float,Character,String
//Declarando e inicializar un ArrayList 
//5->1->2->6->10
//0  1  2  3  4
        ArrayList<Integer> miPrimerArrayList=new ArrayList<>();
        //Ingreso de datos
        miPrimerArrayList.add(5);
        miPrimerArrayList.add(1);
        miPrimerArrayList.add(2);
        miPrimerArrayList.add(6);
        miPrimerArrayList.add(10);
        //Mostrar Valores mas no sacarlos
        //Opcion 1 Para recorrer y mostrar los elementos de un arraylist
        //fori=for i=0
        for (int i = 0; i < miPrimerArrayList.size(); i++) {
            System.out.print(miPrimerArrayList.get(i)+",");
        }
        System.out.println("");
        //Opcion 2 Para recorrer y mostrar los elementos de un arraylist
        //fore=foreach
        for (Integer x : miPrimerArrayList) {
            System.out.print(x+",");
        }
        System.out.println("");
        //Opcion 3 Para recorrer y mostrar los elementos de un arraylist
        System.out.println(Arrays.asList(miPrimerArrayList));
        //Eliminar o Remover un Elemento del ArrayList
        //Eliminar Todos Los Elementos del ArrayList
        miPrimerArrayList.removeAll(miPrimerArrayList);
        System.out.println(Arrays.asList(miPrimerArrayList));
        miPrimerArrayList.add(5);
        miPrimerArrayList.add(1);
        miPrimerArrayList.add(2);
        miPrimerArrayList.add(6);
        miPrimerArrayList.add(10);
          miPrimerArrayList.add(2);
        miPrimerArrayList.add(6);
        miPrimerArrayList.add(10);
          System.out.println(Arrays.asList(miPrimerArrayList));
          //Eliminar Todos Los Elementos del ArrayList
        miPrimerArrayList.clear();
        System.out.println(Arrays.asList(miPrimerArrayList));
          miPrimerArrayList.add(5);
        miPrimerArrayList.add(1);
        miPrimerArrayList.add(2);
        miPrimerArrayList.add(6);
        miPrimerArrayList.add(10);
          miPrimerArrayList.add(1222);
        miPrimerArrayList.add(12);
        miPrimerArrayList.add(122);
          miPrimerArrayList.add(12232);
        miPrimerArrayList.add(124);
        miPrimerArrayList.add(1225);
          System.out.println(Arrays.asList(miPrimerArrayList));
          miPrimerArrayList.remove(10);
          System.out.println(Arrays.asList(miPrimerArrayList));
    }
    
}
