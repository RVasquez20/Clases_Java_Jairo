/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CortarImagen;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author jesus
 */
public class PaintImages extends JFrame{

     public PaintImages() throws IOException {

        initUI();
    }

    private void initUI() throws IOException {

        add(new Lienzo());

        pack();

        setTitle("Dividir imagen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                PaintImages ex;
                try {
                    ex = new PaintImages();
                    ex.setVisible(true);
                } catch (IOException ex1) {
                    Logger.getLogger(PaintImages.class.getName()).log(Level.SEVERE, null, ex1);
                }
                
            }
        });
    }
    
}
