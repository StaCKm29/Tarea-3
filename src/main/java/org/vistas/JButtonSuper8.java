package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.net.URL;


public class JButtonSuper8 extends JRadioButton {

    public JButtonSuper8() {
        super("Precio: $300");

        URL urlSuper8 = getClass().getClassLoader().getResource("super8.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("super8Seleccionado.png");

        int ancho = 150;
        int alto = 170;

        ImageIcon iconSuper8 = new ImageIcon(new ImageIcon(urlSuper8).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        this.setIcon(iconSuper8);
        this.setSelectedIcon(iconSeleccionado);
    }
}
