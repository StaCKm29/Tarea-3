package org.vistas.imagenes;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * Clase que representa un componente imagen de CocaCola.
 */
public class ImageCoca extends JPanel {
    private Image imagen;

    /**
     * Constructor de la clase ImageCoca.
     */
    public ImageCoca() {
        setOpaque(false);
        URL imagenURL = getClass().getClassLoader().getResource("Coca-Cola.png");
        try{
            imagen = ImageIO.read(imagenURL);
            int ancho = 70;
            int alto = 70;
            imagen = imagen.getScaledInstance(ancho, alto, Image.SCALE_DEFAULT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setPreferredSize(new Dimension(imagen.getWidth(null), imagen.getHeight(null)));

    }

    /**
     * Metodo que se encarga de pintar la imagen en el componente.
     * @param g Objeto Graphics.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, this);
    }
}
