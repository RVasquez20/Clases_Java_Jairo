/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg16;

/**
 *
 * @author Rodrigo
 */
public class Vehiculo_Turismo extends Vehiculo{
    private int numerodePuertas;

    public Vehiculo_Turismo(int numerodePuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numerodePuertas = numerodePuertas;
    }

    public int getNumerodePuertas() {
        return numerodePuertas;
    }
   
    @Override
    public String MostrarDatos(){
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + " Numero de Puertas:"+numerodePuertas+ '}';
    }
    
    
}
