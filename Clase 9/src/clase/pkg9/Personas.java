/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg9;
import javax.swing.*;
/**
 *
 * @author Rodrigo
 */
//Modificadores De Acceso o Getters/Setters
public class Personas {
    private String nombre,apellido,direccion;
    private int edad,telefono;

    public Personas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", edad=" + edad + ", telefono=" + telefono + '}';
    }
    
    public void Ingreso(){
        this.setNombre(JOptionPane.showInputDialog("Ingrese el Nombre"));
        this.setApellido(JOptionPane.showInputDialog("Ingrese el Apellio"));
        this.setDireccion(JOptionPane.showInputDialog("Ingrese la Direccion"));
        this.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Telefono")));
        this.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad")));        
    }
    

    
}
