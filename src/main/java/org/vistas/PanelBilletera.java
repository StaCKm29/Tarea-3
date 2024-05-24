package org.vistas;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class PanelBilletera extends JPanel {

    public PanelBilletera() {
        setLayout(new GridLayout(2,2));

        URL[] rutaImagenes = new URL[4];
        rutaImagenes [0] = getClass().getClassLoader().getResource("moneda500.png");
        rutaImagenes [1] = getClass().getClassLoader().getResource("moneda100.png");
        rutaImagenes [2] = getClass().getClassLoader().getResource("1000pesos.png");
        rutaImagenes [3] = getClass().getClassLoader().getResource("2000pesos.png");

        for(URL url : rutaImagenes){
            ImageIcon moneda = new ImageIcon(url);
            JLabel label = new JLabel(moneda);
            add(label);
        }
    }

    public static void main(String[] args) {
        // Crear el JFrame (ventana)
        JFrame frame = new JFrame("Mostrar Varias Imágenes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 600);

        // Crear una instancia del PanelBilletera
        PanelBilletera panel = new PanelBilletera();
        frame.add(panel);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}


