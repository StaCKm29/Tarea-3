package org.vistas;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageSprite extends JPanel {
    private Image imagen;
    public ImageSprite(){
        URL imagenURL = getClass().getClassLoader().getResource("sprite.png");
        try{
            imagen = ImageIO.read(imagenURL);
            int ancho = 70;
            int alto = 70;
            imagen = imagen.getScaledInstance(ancho, alto, Image.SCALE_DEFAULT);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, this);
    }
}
