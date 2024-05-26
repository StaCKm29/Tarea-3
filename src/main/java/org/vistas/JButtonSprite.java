package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonSprite extends JRadioButton{
    public JButtonSprite() {
        super("Precio: $1200");

        URL urlSprite = getClass().getClassLoader().getResource("sprite.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("seleccionado.png");

        int ancho = 150;
        int alto = 170;
        ImageIcon iconSprite = new ImageIcon(new ImageIcon(urlSprite).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconSprite);
        this.setSelectedIcon(iconSeleccionado);
    }
}
