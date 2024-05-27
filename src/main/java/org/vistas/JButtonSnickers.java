package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonSnickers extends JRadioButton{
    JButtonSnickers() {
        super("Precio: $1500");
        URL urlSnickers = getClass().getClassLoader().getResource("snickers.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("seleccionado.png");

        int ancho = 150;
        int alto = 170;
        ImageIcon iconSnickers = new ImageIcon(new ImageIcon(urlSnickers).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconSnickers);
        this.setSelectedIcon(iconSeleccionado);
    }
}
