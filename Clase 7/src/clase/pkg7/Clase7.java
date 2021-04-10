/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;
import Paquete_2.*;

/**
 *
 * @author Rodrigo
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hola();
        Saludos obj1=new Saludos();
        obj1.saludarTresVeces();
        Saludos obj2=new Saludos("Primer Constructor Con Parametros");
        obj2.saludarTresVeces();
        Persona obj3=new Persona();
        obj3.mostrarNombre();
    }
    
    public static void Hola(){
        System.out.println("Hola mundo primer metodo");
    }
    
    //Tarea:
    /*Hacer la clase calculadora, con sus metodos sumar,restar,multiplicar,dividir
    potencia metodos de tipo void.
    */
}
