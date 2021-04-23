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
public class Triangulo extends DosDimensiones{
    public String Estilo;

    public Triangulo() {
    }

    public Triangulo(String Estilo, double base, double altura) {
        super(base, altura);
        this.Estilo = Estilo;
    }
    
    public void area(){
        System.out.println("El area es:"+(base*altura/2));
    }
    public void estilo(){
        System.out.println("Estilo:"+Estilo);
    }
}
