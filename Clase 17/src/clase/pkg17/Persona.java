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
public class Persona {
    private String Apellido,Edad;

    private String nombre;
    
    public Persona() {
    }

    public Persona(String nombre, String Apellido, String Edad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String MostrarDatos() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
}
