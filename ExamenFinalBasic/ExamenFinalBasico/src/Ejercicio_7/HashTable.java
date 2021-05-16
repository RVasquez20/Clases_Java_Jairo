// Ejericico 7: Realice un diccionario de la palabras reservadas que aprecio en Java, utilizando hashtable.

package Ejercicio_7;

import java.util.*;

public class HashTable {

    public static void main(String[] args) {
        Hashtable diccionario = new Hashtable();
        
        diccionario.put("for", "Hace referencia a un ciclo, usualmente se usa para recorrer arrays");
        diccionario.put("swith", "Se utiliza para realizar menu interactivos");
        diccionario.put("break", "Se utiliza para detener o finalizar un bloque de codigo");
        diccionario.put("import", "Es utilizado para importar paquetes o librerias");
        diccionario.put("entends", "Es utilizado en la clases, para indicar que es una subclase");
        
        diccionario.forEach((t, u) -> {
            System.out.println("Llave: " + t + "\nValor: " + u + "\n");
        });
        

    }
    
}
