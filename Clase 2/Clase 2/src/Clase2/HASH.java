/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class HASH {
    public static void main(String[] args) {
        Hashtable hashTable=new Hashtable();
        HashMap<String,String> map=new HashMap<>();
        
                
        hashTable.put(1, "Juan");
        hashTable.put(2, "Juana");
        hashTable.put(3, "Juanito");
        
        map.put("1","Juanito");
        map.put("2","Juana");
        map.put("4","Juan");

        //Recorre un HashTable
        Enumeration enumeracion=hashTable.elements();
        while (enumeracion.hasMoreElements()) {
            System.out.println("Valores del HashTable:"+enumeracion.nextElement());
        }
        
        //Recorrer un HashMap
        
        for (String dato : map.values()) {
            System.out.println("Valores de HashMap:"+dato);
        }
        //Recorrer un HashMap pero viendo la clave y el valor
        for (String dato : map.keySet()) {
            System.out.println("Key:"+dato+" Valor:"+map.get(dato));
        }
        
    }
}
