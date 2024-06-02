package org.vistas.imagenes;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Clase que representa un componente de imagen de una cámara super 8.
 */
public class ImageSuper8 extends JPanel{
    private Image imagen;
    public ImageSuper8(){
        setOpaque(false);
        URL imagenURL = getClass().getClassLoader().getResource("super8.png");
        try{
            imagen = ImageIO.read(imagenURL);
            int ancho = 70;
            int alto = 70;
            imagen = imagen.getScaledInstance(ancho, alto, Image.SCALE_DEFAULT);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.setPreferredSize(new Dimension(imagen.getWidth(null), imagen.getHeight(null)));
        setOpaque(false);
    }

    /**
     * Metodo que se encarga de pintar la imagen en el componente.
     * @param g Objeto Graphics.
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, this);
    }
}
