/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CortarImagen;

/**
 *
 * @author jesus
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.imageio.ImageIO;

public class Lienzo extends JPanel {

    private BufferedImage imagenPrincipal;
    private int width, height;
    //private Image imagePart1, imagePart2;

    private ArrayList<Image> imagenPartes = new ArrayList();

    public Lienzo() throws IOException {
        initBoard();
    }

    private void initBoard() throws IOException {
        loadImage();
        setPreferredSize(new Dimension(width, height + 2));
    }

    private void loadImage() throws IOException {
        imagenPrincipal = ImageIO.read(new File("2551513.jpg"));
        
        width = imagenPrincipal.getWidth(null);
        height = imagenPrincipal.getHeight(null);

      /*  imagePart1 = createImage(new FilteredImageSource(imagenPrincipal.getSource(),
            new CropImageFilter(0, 0,width , height / 2)));        
        imagePart2 = createImage(new FilteredImageSource(imagenPrincipal.getSource(),
            new CropImageFilter(0, height / 2, width, height / 2)));
      */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Image TempImage = createImage(new FilteredImageSource(imagenPrincipal.getSource(),
                new CropImageFilter(j * (width/ 5) , i * (height / 5), width / 5, height / 5)));
                imagenPartes.add(TempImage);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
       /*  g.drawImage(imagePart2, 0, 0, null);
         g.drawImage(imagePart1, 0, height / 2 + 2, null);*/

        int iter = 0;
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                g.drawImage(imagenPartes.get(iter), i * (width / 5), j * (height / 5), null);
                iter++;
            }
        }
    }

}
/*
<a href='http://www.freepik.es/vector-gratis/burbuja-de-texto-wow_1111599.htm'>Designed by Freepik</a>
<a href="http://www.freepik.es/vector-gratis/burbuja-de-texto-wow_1111599.htm">Diseñado por Freepik</a>
https://opengameart.org/users/heindalwesnoth
 */