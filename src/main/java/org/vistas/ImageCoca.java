package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageCoca extends JPanel {
    private Image imagen;

    public ImageCoca() {
        URL imagenURL = getClass().getClassLoader().getResource("Coca-Cola.png");
        try{
            imagen = ImageIO.read(imagenURL);
            int ancho = 200;
            int alto = 200;
            imagen = imagen.getScaledInstance(ancho, alto, Image.SCALE_DEFAULT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setPreferredSize(new Dimension(imagen.getWidth(null), imagen.getHeight(null)));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, this);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Imagen de coca");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ImageCoca()); // Cambia esto a la ruta de tu imagen
        frame.pack();
        frame.setVisible(true);
    }
}
