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
public class Vehiculo_Fulgoneta extends Vehiculo{
    private int carga;

    public Vehiculo_Fulgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
     @Override
    public String MostrarDatos(){
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + " Carga:"+carga+ '}';
    }
}
