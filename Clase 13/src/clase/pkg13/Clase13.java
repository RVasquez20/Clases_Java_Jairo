/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg13;

/**
 *
 * @author Rodrigo
 */
public class Clase13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Que es la herencia: es una forma de reutilizacion de software en la que se crea
        una nueva clase al absorber los miermbros de una ya existente*/
        Estudiante estudiante=new Estudiante("Jairo","Escobar",25,10121, 98.2f);
        estudiante.mostrarDatos();
        //Sobre escritura de miembros
        //Es realizar la misma accion de diferente manera
        /**
         * No debemos confindirlo
         * Esto es una sobrecarga de metodos
         * public void caminar(int distancia){
         *System.out.println(distancia);
         * }
         * 
         * public void caminar(){
         * System.out.println("Esta Caminando");
         * }
         */
        
        /*Tarea:
        Realizar un programa donde aplique herencia a su creatividad*/
    }
    
}


































