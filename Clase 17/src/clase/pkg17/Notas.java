/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg17;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Notas {
    private ArrayList<Integer>notas;

    public Notas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return ""+Arrays.asList(notas);
    }
    
    
}
