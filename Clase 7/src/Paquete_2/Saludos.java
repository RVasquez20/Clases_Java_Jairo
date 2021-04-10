/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete_2;

/**
 *
 * @author Rodrigo
 */
public class Saludos {
    //Atributo
    
    public String saludoUno;
    
    //Constructor
    //Constructor Vacio
    public Saludos(){}
    //Constructor En donde me den el valor del atributo
    public Saludos(String saludoUno){
     this.saludoUno=saludoUno;   
    }
    //Metodo
    
    public void saludarCuatroVeces(){
        saludoUno="Hola Mundo";
        for (int i = 0; i < 4; i++) {
            System.out.println(saludoUno+" "+(i+1));  
        }
    }
     public void saludarTresVeces(){
        for (int i = 0; i < 3; i++) {
            System.out.println(saludoUno+" "+(i+1));  
        }
    }
}
