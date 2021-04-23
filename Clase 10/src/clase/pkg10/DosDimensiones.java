/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg10;

/**
 *
 * @author Rodrigo
 */
public class DosDimensiones {
    public double base,altura;

    public DosDimensiones() {
    }

    public DosDimensiones(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public void MostrarDimensiones(){
        System.out.println("La base y altura es:"+base+","+altura);
    }
    
}
