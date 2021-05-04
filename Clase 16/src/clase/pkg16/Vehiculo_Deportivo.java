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
public class Vehiculo_Deportivo extends Vehiculo{
    private int cilindrada;

    public Vehiculo_Deportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

     @Override
    public String MostrarDatos(){
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + " Cilindrada:"+cilindrada+ '}';
    }
}
