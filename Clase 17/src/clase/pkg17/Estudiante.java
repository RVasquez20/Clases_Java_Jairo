/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg17;

/**
 *
 * @author Rodrigo
 */
public class Estudiante extends Persona {

    private String carne,semestre;
    private Notas notas;

    public Estudiante(String carne, String semestre, Notas notas, String nombre, String Apellido, String Edad) {
        super(nombre, Apellido, Edad);
        this.carne = carne;
        this.semestre = semestre;
        this.notas = notas;
    }

    
    @Override
    public String MostrarDatos() {
        return "Estudiante{ Nombre:"+getNombre()+" Apellidos:"+getApellido()+" Edad:"+getEdad()+"carne=" + carne + ", semestre=" + semestre + ", notas=" + notas.toString() + '}';
    }

   public void MostrarNombres(){
       System.out.println(getNombre());
}
    
    
    
    
    
}
