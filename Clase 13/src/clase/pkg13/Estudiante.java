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
//Subclase o clase hija
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre, String apellido, int edad,int codigoEstudiante,float notaFinal)
    {
        super(nombre,apellido,edad);
        this.codigoEstudiante=codigoEstudiante;
        this.notaFinal=notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("Nombre:"+getNombre()+
                "\nApellido:"+getApellido()+
                "\nEdad:"+getEdad()+
                "\nCodigo de Estudiante:"+codigoEstudiante+
                "\nNota Final:"+notaFinal+"\n");
    }
    
    
}
