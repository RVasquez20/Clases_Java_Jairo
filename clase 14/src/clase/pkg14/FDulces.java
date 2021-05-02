/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg14;

/**
 *
 * @author Rodrigo
 */
public class FDulces extends Frutas{
    private String Color;

    public FDulces(String Color, String Nombre) {
        super(Nombre);
        this.Color = Color;
    }

 

    @Override
    public String toString() {
        return "FDulces{Nombre:"+getNombre()+ "Color=" + Color + '}';
    }
    
    

}
