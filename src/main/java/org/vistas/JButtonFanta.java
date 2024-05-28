package org.vistas;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class JButtonFanta extends JRadioButton{
    public JButtonFanta() {
        super("Precio: $1200");

        URL urlFanta = getClass().getClassLoader().getResource("fanta.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("fantaSeleccionado.png");

        int ancho = 150;
        int alto = 170;
        ImageIcon iconFanta = new ImageIcon(new ImageIcon(urlFanta).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconFanta);
        this.setSelectedIcon(iconSeleccionado);
    }
}
